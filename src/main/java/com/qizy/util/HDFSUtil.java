package com.qizy.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * HDFS 启动配置
 */
@Component
public class HDFSUtil {

    private static Logger logger = Logger.getLogger(HDFSUtil.class);

    @Value("${hdfs.url}")
    private String hdfsUrl;


    /**
     * 初始化HDFS操作类，返回一个客户端连接对象
     *
     * @return FileSystem
     */
    public FileSystem getFileSystem() throws IOException {
        // 相关配置
        Configuration conf = new Configuration();
        // 设置操作的文件系统是HDFS，并且指定操作地址
        conf.set("fs.defaultFS", hdfsUrl);
        return FileSystem.get(conf);
    }

    public void close(FileSystem fs) throws IOException {
        fs.close();
    }

    /**
     * 从本地上传
     * @param localFilePath 本地文件路径
     * @param dst   hdfs目的路径
     * @throws IOException
     */
    public void upFileFromLocal(String localFilePath,String dst) throws IOException {
        FileSystem fs = getFileSystem();
        Path srcPath = new Path(localFilePath);
        Path dstPath = new Path(dst);
        fs.copyFromLocalFile(srcPath,dstPath);
    }

    /**
     * 下载到本地
     * @param localFilePath 本地文件路径
     * @param dst   hdfs目的路径
     * @throws IOException
     */
    public void downFileToLocal(String localFilePath,String dst) throws IOException {
        FileSystem fs = getFileSystem();
        Path srcPath = new Path(localFilePath);
        Path dstPath = new Path(dst);
        fs.copyToLocalFile(srcPath,dstPath);
    }
}
