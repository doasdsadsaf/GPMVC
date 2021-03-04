package com.gupaoedu.demo.serivce.Imp;

import com.gupaoedu.mvcframework.annotation.GPService;

/**
 * 核心业务逻辑
 *
 * @创建人 dw
 * @创建时间 2021/3/4
 * @描述
 */
@GPService
public class DemoService implements IDemoService {
    public String get(String name) {
        return "My name is " + name;
    }

}
