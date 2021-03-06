package com.imooc.sell.utils;

import java.util.Random;

/**
 * @author zhe
 * @date 2020/3/21 2:58
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000; //代表生成的是六位随机数

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
