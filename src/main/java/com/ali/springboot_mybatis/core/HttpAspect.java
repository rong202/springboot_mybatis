package com.ali.springboot_mybatis.core;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Slf4j
@Aspect
@Component
public class HttpAspect {
    @Pointcut("execution(public * com.ali.springboot_mybatis.controller.Controller.*(..))")
    public void log(){

    }
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("-------------------------切面开始");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        System.out.println("-------"+signature.getName());

        //获取请求的类名
        String className = joinPoint.getTarget().getClass().getName();
        //获取请求的方法名
        Method method = signature.getMethod();
        String methodName = method.getName();
        System.out.println("======="+method);
        System.out.println("======="+methodName);



        //url
        log.info("url={}", request.getRequestURI());

        //method
        log.info("method={}", request.getMethod());

        //ip
        log.info("ip={}", request.getRemoteAddr());

        //method
        log.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

        //param
        log.info("args={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
       /* System.out.println("切面开始。。。。");
        SysLogBean sysLogBean = new SysLogBean();

        //从切面织入点处通过反射机制获取织入点处的方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //获取切入点所在的方法
        Method method = signature.getMethod();

        SysLog sysLog = method.getAnnotation(SysLog.class);

        if (sysLog != null) {
            String value = sysLog.value();
            sysLogBean.setOperation(value);
        }

        //获取请求的类名
        String className = joinPoint.getTarget().getClass().getName();
        //获取请求的方法名
        String methodName = method.getName();
        sysLogBean.setMethod(className + "." + methodName);

        sysLogBean.setLoginDate(new Date());
        //获取用户名
        sysLogBean.setUsername(SaasUtil.getTenantId());*/
    }

    @AfterReturning(returning="obj", pointcut = "log()")
    public void doAfterReturnig(Object obj){
        log.info("reponse={}", obj);
    }
}
