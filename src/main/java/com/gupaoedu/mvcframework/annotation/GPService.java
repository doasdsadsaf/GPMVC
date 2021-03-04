package com.gupaoedu.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * 自定义咕泡 Service注解
 *
 * @创建人 dw
 * @创建时间 2021/3/4
 * @描述
 */
//@Target 是java的元注解,用来指定注解修饰哪个类成员,{}表示一个数组,能修饰多个不同的类成员
//用于描述类、接口(包括注解类型) 或enum声明
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPService {
    String value() default "";
}
