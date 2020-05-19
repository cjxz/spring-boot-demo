/*
 * Copyright 2020 jv.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with jv.cn
 */
package com.cjxz.service;

/**
 * @author zhuchao
 * @date 2020/5/186:40 下午
 */
public interface AsyncService {
    void async1() throws InterruptedException;
    void async2() throws InterruptedException;
    void async3() throws InterruptedException;
}
