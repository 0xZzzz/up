package com.zq.common.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public abstract class AbstractAdvice {

    public Object proceed(ProceedingJoinPoint point) throws Throwable {
        return point.proceed();
    }

}
