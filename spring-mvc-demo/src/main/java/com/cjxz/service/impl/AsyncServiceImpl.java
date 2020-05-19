/*
 * Copyright 2020 jv.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with jv.cn
 */
package com.cjxz.service.impl;

import com.cjxz.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zhuchao
 * @date 2020/5/186:40 下午
 */
@Service
public class AsyncServiceImpl implements AsyncService {

    @Async
    public void async1() throws InterruptedException {
        for(int i =0 ; i < 10 ; i ++){
            Thread.sleep(100);
            System.out.println("com.cjxz.service.impl.AsyncServiceImpl.async1:"+i);
        }
    }
    @Async
    public void async2() throws InterruptedException {
        for(int i =0 ; i < 10 ; i ++){
            Thread.sleep(100);
            System.out.println("com.cjxz.service.impl.AsyncServiceImpl.async2:"+i);
        }
    }
    @Async
    public void async3() throws InterruptedException {
        for(int i =0 ; i < 10 ; i ++){
            Thread.sleep(100);
            System.out.println("com.cjxz.service.impl.AsyncServiceImpl.async3:"+i);
        }
    }
}
