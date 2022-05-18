package com.qizy.createSourceLog;


import com.qizy.basedata.BaseData;
import com.qizy.basedata.ProductData;
import com.qizy.basedata.UserMsg;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 模拟不同系统产生的日志，后端没必要研究JS埋点哪些生成日志的方法
 */
@Component
public class CreateWebLog {


    private static Logger logger = Logger.getLogger(CreateWebLog.class);

    /**
     * 电商网站日志模拟
     */
    @Scheduled(fixedDelay = 1000 * 15)
    public void shoppingLogCreate() {
        // 日式格式 product,userId,event,area,ts
        // event browse浏览,click点击,collect收藏,buy购买
        List<String> typeList = new ArrayList<>();
        for (Map.Entry<String, String> entry : ProductData.typeMap.entrySet()) {
            typeList.add(entry.getKey());
        }

        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            threadPool.execute(() -> {
//                  Date now = new Date();
                UserMsg userMsg = BaseData.ranDowCreateUser();
                int t = new Random().nextInt(typeList.size());
                String productType = typeList.get(t);
                List<String> productList = ProductData.productMap.get(productType);
                int p = new Random().nextInt(productList.size());
                String productName = productList.get(p);
                if (userMsg != null && userMsg.getUserId() != null) {
                    logger.info(productName + "," + userMsg.getUserId() + "," + "browse" + "," + userMsg.getCityNo());
                    try {
                        // 25% 可能点击
                        int r = new Random().nextInt(4);
                        if (r == 3) {
                            Thread.sleep(1000);
                            logger.info(productName + "," + userMsg.getUserId() + "," + "click" + "," + userMsg.getCityNo());
                            // 20% 收藏
                            r = new Random().nextInt(5);
                            if (r == 4) {
                                Thread.sleep(1000);
                                logger.info(productName + "," + userMsg.getUserId() + "," + "collect" + "," + userMsg.getCityNo());
                            }
                            // 10% 购买
                            r = new Random().nextInt(10);
                            if (r == 9) {
                                Thread.sleep(500);
                                logger.info(productName + "," + userMsg.getUserId() + "," + "buy" + "," + userMsg.getCityNo());
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

        }
        threadPool.shutdown();
    }

    /**
     * 其他跟数据挖掘不相干的日志
     */
    @Scheduled(fixedDelay = 1000 * 10)
    public void otherLogCreate() {
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(800);
                logger.info("other log ....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
