package com.sxc.ds.annotation;

import java.lang.annotation.*;

/**
 * @author Songxc
 * @date 2020/3/31 9:13
 */
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String value() default "master";
}
