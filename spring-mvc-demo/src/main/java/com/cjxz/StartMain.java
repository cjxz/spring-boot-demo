package com.cjxz;/*
 * Copyright 2020 jv.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with jv.cn
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author zhuchao
 * @date 2020/4/2910:51 下午
 */
@SpringBootApplication
@EnableAsync
public class StartMain {
    public static void main(String[] args) {
        SpringApplication.run(StartMain.class,args);
    }
}
