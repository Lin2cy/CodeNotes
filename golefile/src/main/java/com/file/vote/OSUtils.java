package com.file.vote;

import org.apache.commons.io.FileSystemUtils;

import java.io.IOException;

/**
 * @Description: ${todo}
 * @author: lin2cy
 * @createTime: 2018/4/24 16:06
 */
public class OSUtils {
    /**
     * 功能：可用磁盘
     * */
    public static int disk() {
        try {
            long total = FileSystemUtils.freeSpaceKb("/home");
            double disk = (double) total / 1024 / 1024;
            return (int) disk;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
