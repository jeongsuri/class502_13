package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyCalculator {

    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()") // pointcut의 경로로 유효범위 적용
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        long stime = System.nanoTime(); //공통 기능
        try {

            Object result = joinPoint.proceed(); //핵심 기능 대신 실행 - factorial

            return result;
        }finally {
            long etime = System.nanoTime(); //공통 기능
            System.out.println(etime - stime);
        }
    }
}
