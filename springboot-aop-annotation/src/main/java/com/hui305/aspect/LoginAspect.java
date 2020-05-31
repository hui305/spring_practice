package com.hui305.aspect;


import com.hui305.annotation.BussAnnotation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by hui_stone on 2020/5/26 0026.
 */
@Aspect
@Component
@Order(1)
public class LoginAspect {

    @Pointcut("execution(public * com.hui305..*.addUser(..))")
    public void aApplogic() {

    }

    @Pointcut("execution(public * com.hui305..*.addOne(..))")
    public void joinPointForAddOne() {

    }

    @Around(value = "aApplogic() && @annotation(annotation) &&args(object,..)", argNames = "annotation,object")
    public Object interceptorApplogic(ProceedingJoinPoint pj,
            BussAnnotation annotation, Object object) throws Throwable {
        System.out.println("moduleName:" + annotation.moduleName());
        System.out.println("option:" + annotation.option());
        pj.proceed();
        System.out.println(pj.getSignature().getName());
        for(Object obj : pj.getArgs()){
            System.out.println(obj.toString());
        }
        return object;
        }
}