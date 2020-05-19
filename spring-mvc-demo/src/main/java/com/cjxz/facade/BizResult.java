/*
 * Copyright 2020 jv.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with jv.cn
 */
package com.cjxz.facade;

import lombok.Data;

/**
 * @author zhuchao
 * @date 2020/4/2910:57 下午
 */
@Data
public class BizResult<T> {
    private T obj;
    private int code;
    private String msg;

    public BizResult(T obj, int code, String msg) {
        this.obj = obj;
        this.code = code;
        this.msg = msg;
    }
}
