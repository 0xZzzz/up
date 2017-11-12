package com.zq.common.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class CommonAdvice {

    public Object proceed(ProceedingJoinPoint point) throws Throwable {
        return point.proceed();
    }

}
