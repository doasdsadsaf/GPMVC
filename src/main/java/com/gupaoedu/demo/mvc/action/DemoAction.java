package com.gupaoedu.demo.mvc.action;

import com.gupaoedu.demo.serivce.Imp.IDemoService;
import com.gupaoedu.mvcframework.annotation.GPAutowired;
import com.gupaoedu.mvcframework.annotation.GPController;
import com.gupaoedu.mvcframework.annotation.GPRequestMapper;
import com.gupaoedu.mvcframework.annotation.GPRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @创建人 dw
 * @创建时间 2021/3/4
 * @描述
 */
@GPController
@GPRequestMapper("/demo")
public class DemoAction {
    @GPAutowired
    private IDemoService demoService;

    @GPRequestMapper("query")
    public void query(HttpServletRequest request, HttpServletResponse response,
                      @GPRequestParam("name") String name) {
        String result = demoService.get(name);
        try {
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GPRequestMapper("/add")
    public void add(HttpServletRequest request, HttpServletResponse response,
                    @GPRequestParam("a") Integer a, @GPRequestParam("b") Integer b) {
        try {
            response.getWriter().write(a + b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GPRequestMapper("/remove")
    public void add(HttpServletRequest request, HttpServletResponse response,
                    @GPRequestParam("id") Integer id) {
        try {
            response.getWriter().write(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
