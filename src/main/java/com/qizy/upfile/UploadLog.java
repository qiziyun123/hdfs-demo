package com.qizy.upfile;

import com.qizy.util.HDFSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UploadLog {

    @Autowired
    HDFSUtil hDFSUtil;

    @Scheduled(fixedDelay = 1000 * 60 * 60)
    public void shoppingLogCreate() {
        try{
            hDFSUtil.upFileFromLocal("/home/apprun/hdfs_up_demo/logs/info","/qiziyun/shopping_demo/info.log");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
