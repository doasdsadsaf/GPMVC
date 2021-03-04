package com.gupaoedu.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * 自定义咕泡 Autowired注解
 * @创建人 dw
 * @创建时间 2021/3/4
 * @描述
 */
//@Target 是java的元注解,用来指定注解修饰哪个类成员,{}表示一个数组,能修饰多个不同的类成员
    //FIELD 用于描述域
@Target({ElementType.FIELD})
//@Retention 是java的元注解 RUNTIME 注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在
@Retention(RetentionPolicy.RUNTIME)
//@Documented 是java的元注解
@Documented
public @interface GPAutowired {
    String value() default "";
}
