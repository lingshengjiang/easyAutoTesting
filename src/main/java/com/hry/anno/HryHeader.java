package com.hry.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: luqiwei
 * @Date: 2018/8/30 16:01
 */
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface HryHeader {
}
