package com.qizy.basedata;


import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 */
public class BaseData {

    /**
     * 城市列表
     */
    public static Map<Integer, String> cityMap = new HashMap<>();

    /**
     * 用户列表
     */
    public static Map<Integer, List<String>> usrMap = new HashMap<>();

    static {
        int sum = 0;
        // 1-20000 bj_user.txt
        List<String> bjUserList = createUsrList("user/bj_user.txt", 20000);
        cityMap.put(110, "北京市");
        usrMap.put(110, bjUserList);
        sum += bjUserList.size();
        System.out.println(sum);

        // 20001-35000 sh_user.txt
        List<String> shUserList = createUsrList("user/sh_user.txt", 15000);
        cityMap.put(310, "上海市");
        usrMap.put(310, shUserList);
        sum += shUserList.size();
        System.out.println(sum);

        // 35001-45000 gd_user.txt
        List<String> gdUserList = createUsrList("user/gd_user.txt", 10000);
        cityMap.put(440, "广东省");
        usrMap.put(440, gdUserList);
        sum += gdUserList.size();
        System.out.println(sum);

        // 45001-50000 tj_user.txt
        List<String> tjUserList = createUsrList("user/tj_user.txt", 5000);
        cityMap.put(120, "天津市");
        usrMap.put(120, tjUserList);
        sum += tjUserList.size();
        System.out.println(sum);

        // 50001-55000 cq_user.txt
        List<String> cqUserList = createUsrList("user/cq_user.txt", 5000);
        cityMap.put(500, "重庆市");
        usrMap.put(500, cqUserList);
        sum += cqUserList.size();
        System.out.println(sum);

        // 55001-60000 sc_user.txt
        List<String> scUserList = createUsrList("user/sc_user.txt", 5000);
        cityMap.put(510, "四川省");
        usrMap.put(510, scUserList);
        sum += scUserList.size();
        System.out.println(sum);

        // 60001-61000 hebei_user.txt
        List<String> hebeiUserList = createUsrList("user/hebei_user.txt", 1000);
        cityMap.put(130, "河北省");
        usrMap.put(130, hebeiUserList);
        sum += hebeiUserList.size();
        System.out.println(sum);

        // 61001-62000 Shanxi_user.txt
        List<String> shanXiUserList = createUsrList("user/Shanxi_user.txt", 1000);
        cityMap.put(140, "山西省");
        usrMap.put(140, shanXiUserList);
        sum += shanXiUserList.size();
        System.out.println(sum);

        // 62001-63000 nmg_user.txt
        List<String> nmgUserList = createUsrList("user/nmg_user.txt", 1000);
        cityMap.put(150, "内蒙古自治区");
        usrMap.put(150, nmgUserList);
        sum += nmgUserList.size();
        System.out.println(sum);

        // 63001-65000 ln_user.txt
        List<String> lnUserList = createUsrList("user/ln_user.txt", 2000);
        cityMap.put(210, "辽宁省");
        usrMap.put(210, lnUserList);
        sum += lnUserList.size();
        System.out.println(sum);

        // 65001-66000 jl_user.txt
        List<String> jlUserList = createUsrList("user/jl_user.txt", 1000);
        cityMap.put(220, "吉林省");
        usrMap.put(220, jlUserList);
        sum += jlUserList.size();
        System.out.println(sum);


        // 66001-67000 hlj_user.txt
        List<String> hljUserList = createUsrList("user/hlj_user.txt", 1000);
        cityMap.put(230, "黑龙江省");
        usrMap.put(230, hljUserList);
        sum += hljUserList.size();
        System.out.println(sum);

        // 67001-68500 js_user.txt
        List<String> jsUserList = createUsrList("user/js_user.txt", 1500);
        cityMap.put(320, "江苏省");
        usrMap.put(320, jsUserList);
        sum += jsUserList.size();
        System.out.println(sum);

        // 68501-70000 zj_user.txt
        List<String> zjUserList = createUsrList("user/zj_user.txt", 1500);
        cityMap.put(330, "浙江省");
        usrMap.put(330, zjUserList);
        sum += zjUserList.size();
        System.out.println(sum);

        // 70001-71000 ah_user.txt
        List<String> ahUserList = createUsrList("user/ah_user.txt", 1000);
        cityMap.put(340, "安徽省");
        usrMap.put(340, ahUserList);
        sum += ahUserList.size();
        System.out.println(sum);

        // 71001-72000 fj_user.txt
        List<String> fjUserList = createUsrList("user/fj_user.txt", 1000);
        cityMap.put(350, "福建省");
        usrMap.put(350, fjUserList);
        sum += fjUserList.size();
        System.out.println(sum);

        // 72001-73000 jx_user.txt
        List<String> jxUserList = createUsrList("user/jx_user.txt", 1000);
        cityMap.put(360, "江西省");
        usrMap.put(360, jxUserList);
        sum += jxUserList.size();
        System.out.println(sum);

        // 73001-75000 sd_user.txt
        List<String> sdUserList = createUsrList("user/sd_user.txt", 2000);
        cityMap.put(370, "山东省");
        usrMap.put(370, sdUserList);
        sum += sdUserList.size();
        System.out.println(sum);

        // 75001-77000 hn_user.txt
        List<String> hnUserList = createUsrList("user/hn_user.txt", 2000);
        cityMap.put(410, "河南省");
        usrMap.put(410, hnUserList);
        sum += hnUserList.size();
        System.out.println(sum);

        // 77001-79000 hubei_user.txt
        List<String> hubeiUserList = createUsrList("user/hubei_user.txt", 2000);
        cityMap.put(420, "湖北省");
        usrMap.put(420, hubeiUserList);
        sum += hubeiUserList.size();
        System.out.println(sum);

        // 79001-81000 hunan_user.txt
        List<String> hunanUserList = createUsrList("user/hunan_user.txt", 2000);
        cityMap.put(430, "湖南省");
        usrMap.put(430, hunanUserList);
        sum += hunanUserList.size();
        System.out.println(sum);

        // 81001-82000 gx_user.txt
        List<String> gxUserList = createUsrList("user/gx_user.txt", 1000);
        cityMap.put(450, "广西壮族自治区");
        usrMap.put(450, gxUserList);
        sum += gxUserList.size();
        System.out.println(sum);

        // 82001-83000 hainan_user.txt
        List<String> haiNanUserList = createUsrList("user/hainan_user.txt", 1000);
        cityMap.put(460, "海南省");
        usrMap.put(460, haiNanUserList);
        sum += haiNanUserList.size();
        System.out.println(sum);

        // 83001-84000 guizhou_user.txt
        List<String> guiZhouUserList = createUsrList("user/guizhou_user.txt", 1000);
        cityMap.put(520, "贵州省");
        usrMap.put(520, guiZhouUserList);
        sum += guiZhouUserList.size();
        System.out.println(sum);

        // 84001-85000 yn_user.txt
        List<String> ynUserList = createUsrList("user/yn_user.txt", 1000);
        cityMap.put(530, "云南省");
        usrMap.put(530, ynUserList);
        sum += ynUserList.size();
        System.out.println(sum);

        // 85001-86000 xz_user.txt
        List<String> xzUserList = createUsrList("user/xz_user.txt", 1000);
        cityMap.put(540, "西藏自治区");
        usrMap.put(540, xzUserList);
        sum += xzUserList.size();
        System.out.println(sum);

        // 86001-88000 Shaanxi_user.txt
        List<String> shaanXiUserList = createUsrList("user/Shaanxi_user.txt", 2000);
        cityMap.put(610, "陕西省");
        usrMap.put(610, shaanXiUserList);
        sum += shaanXiUserList.size();
        System.out.println(sum);

        // 88001-89000 gs_user.txt
        List<String> gsUserList = createUsrList("user/gs_user.txt", 1000);
        cityMap.put(620, "甘肃省");
        usrMap.put(620, gsUserList);
        sum += gsUserList.size();
        System.out.println(sum);

        // 89001-90000 qh_user.txt
        List<String> qhUserList = createUsrList("user/qh_user.txt", 1000);
        cityMap.put(630, "青海省");
        usrMap.put(630, qhUserList);
        sum += qhUserList.size();
        System.out.println(sum);

        // 90001-91000 ningxia_user.txt
        List<String> ningXiaUserList = createUsrList("user/ningxia_user.txt", 1000);
        cityMap.put(640, "宁夏回族自治区");
        usrMap.put(640, ningXiaUserList);
        sum += ningXiaUserList.size();
        System.out.println(sum);

        // 91001-92000 xinjiang_user.txt
        List<String> xinJiangUserList = createUsrList("user/xinjiang_user.txt", 1000);
        cityMap.put(650, "新疆维吾尔自治区");
        usrMap.put(650, xinJiangUserList);
        sum += xinJiangUserList.size();
        System.out.println(sum);

        // 92001-97000 hk_user.txt
        List<String> hkUserList = createUsrList("user/hk_user.txt", 5000);
        cityMap.put(810, "香港特别行政区");
        usrMap.put(810, hkUserList);
        sum += hkUserList.size();
        System.out.println(sum);

        // 97001-100000 aomen_user.txt
        List<String> amUserList = createUsrList("user/aomen_user.txt", 3000);
        cityMap.put(820, "澳门特别行政区");
        usrMap.put(820, amUserList);
        sum += amUserList.size();
        System.out.println(sum);

        int userSize = 0;
        for (Map.Entry<Integer, List<String>> entry : usrMap.entrySet()) {
            List<String> tmp = entry.getValue();
            userSize += tmp.size();
        }
        System.out.println(userSize);
    }

    private static List<String> createUsrList(String name, int sum) {
        List<String> res = new ArrayList<>(sum);
        try {
            FileReader fr = new FileReader(name);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                //使用readLine方法，一次读一行
                res.add(s);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    /**
     * 随机生成一个用户访问
     *
     * @return
     */
    public static UserMsg ranDowCreateUser() {
        int ran = new Random().nextInt(100000) + 1;
        int range = ran + 1;
        // 1-20000 bj
        if (range >= 1 && range <= 20000) {
            Integer cityCode = 110;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 20001-35000
        if (range >= 20001 && range <= 35000) {
            Integer cityCode = 310;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 35001-45000
        if (range >= 35001 && range <= 45000) {
            Integer cityCode = 440;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 45001-50000
        if (range >= 45001 && range <= 50000) {
            Integer cityCode = 120;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 50001-55000
        if (range >= 50001 && range <= 55000) {
            Integer cityCode = 500;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 55001-60000
        if (range >= 55001 && range <= 60000) {
            Integer cityCode = 510;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 60001-61000
        if (range >= 60001 && range <= 61000) {
            Integer cityCode = 130;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 61001-62000
        if (range >= 61001 && range <= 62000) {
            Integer cityCode = 140;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 62001-63000
        if (range >= 62001 && range <= 63000) {
            Integer cityCode = 150;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 63001-65000
        if (range >= 63001 && range <= 65000) {
            Integer cityCode = 210;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 65001-66000
        if (range >= 65001 && range <= 66000) {
            Integer cityCode = 220;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 66001-67000
        if (range >= 66001 && range <= 67000) {
            Integer cityCode = 230;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 67001-68500
        if (range >= 67001 && range <= 68500) {
            Integer cityCode = 320;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 68501-70000
        if (range >= 68501 && range <= 70000) {
            Integer cityCode = 330;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 70001-71000
        if (range >= 70001 && range <= 71000) {
            Integer cityCode = 340;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 71001-72000
        if (range >= 71001 && range <= 72000) {
            Integer cityCode = 350;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 72001-73000
        if (range >= 72001 && range <= 73000) {
            Integer cityCode = 360;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 73001-75000
        if (range >= 73001 && range <= 75000) {
            Integer cityCode = 370;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 75001-77000
        if (range >= 75001 && range <= 77000) {
            Integer cityCode = 410;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 77001-79000
        if (range >= 77001 && range <= 79000) {
            Integer cityCode = 420;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 79001-81000
        if (range >= 79001 && range <= 81000) {
            Integer cityCode = 430;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 81001-82000
        if (range >= 81001 && range <= 82000) {
            Integer cityCode = 450;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 82001-83000
        if (range >= 82001 && range <= 83000) {
            Integer cityCode = 460;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 83001-84000
        if (range >= 83001 && range <= 84000) {
            Integer cityCode = 520;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 84001-85000
        if (range >= 84001 && range <= 85000) {
            Integer cityCode = 530;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 85001-86000
        if (range >= 85001 && range <= 86000) {
            Integer cityCode = 540;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 86001-88000
        if (range >= 86001 && range <= 88000) {
            Integer cityCode = 610;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 88001-89000
        if (range >= 88001 && range <= 89000) {
            Integer cityCode = 620;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }

        // 89001-90000
        if (range >= 89001 && range <= 90000) {
            Integer cityCode = 630;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 90001-91000
        if (range >= 90001 && range <= 91000) {
            Integer cityCode = 640;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 91001-92000
        if (range >= 91001 && range <= 92000) {
            Integer cityCode = 650;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 92001-97000
        if (range >= 92001 && range <= 97000) {
            Integer cityCode = 810;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        // 97001-100000
        if (range >= 97001 && range <= 100000) {
            Integer cityCode = 820;
            List<String> tmp = usrMap.get(cityCode);
            return getRandomUserMsg(tmp,cityCode);
        }
        return null;
    }

    public static UserMsg getRandomUserMsg(List<String> tmp, Integer cityCode) {
        int t = new Random().nextInt(tmp.size());
        String userId = tmp.get(t);
        UserMsg userMsg = new UserMsg();
        userMsg.setUserId(userId);
        userMsg.setCityNo(cityCode);
        return userMsg;
    }

//    public static void main(String[] args) {
//        int sum = 3000;
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//
//        try{
//            File file = new File("aomen_user.txt");
//            if (file.exists()) {
//                file.delete();
//            }
//            file.createNewFile();
//            fileWriter = new FileWriter("aomen_user.txt");
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (int i = 1; i <= sum; i++) {
//                String userId = UUID.randomUUID().toString();
//                bufferedWriter.write(userId);
//                if (i != sum) {
//                    bufferedWriter.newLine();
//                }
//
//            }
//        } catch (IOException e){
//
//        } finally{
//            try{
//                bufferedWriter.close();
//                fileWriter.close();
//            }catch (IOException e){
//
//            }
//
//        }

//    }
}
