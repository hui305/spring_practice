package com.hui305.annotation;

import java.lang.annotation.*;

/**
 * Created by hui_stone on 2020/5/26 0026.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface BussAnnotation {

    //模块名
    String moduleName() default "";
    //操作内容
    String option() default "";
}
