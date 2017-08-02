package com.zq.common.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2017/5/14.
 */
public abstract class AbstractAdvice {

    public Object proceed(ProceedingJoinPoint point) {
        System.err.println("advice in");
        return null;
    }

}
