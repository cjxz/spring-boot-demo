/*
 * Copyright 2020 jv.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with jv.cn
 */
package com.cjxz.controller;

import com.cjxz.facade.BizResult;
import com.cjxz.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuchao
 * @date 2020/4/2910:56 下午
 */
@RestController
public class HelloController {
    @Autowired
    private AsyncService asyncService;
    @RequestMapping(value = "/hello" , method ={RequestMethod.GET,RequestMethod.POST})
    public BizResult<String> hello(@RequestParam String data){
        BizResult<String> result = new BizResult<String>(data,10000,"成功");
        return result;
    }
    @RequestMapping(value = "/async" , method ={RequestMethod.GET,RequestMethod.POST})
    public BizResult<String> async(){
        try{
            asyncService.async1();
            asyncService.async2();
            asyncService.async3();
        }catch (Exception e){

        }
        return new BizResult<String>("ok",10000,"成功");
    }


}
