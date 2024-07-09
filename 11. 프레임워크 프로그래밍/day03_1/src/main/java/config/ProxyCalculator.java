package config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class ProxyCalculator {

    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {}

    @Before("publicTarget()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before..");
    }

    @After("publicTarget()")
    public void after(JoinPoint joinPoint) {
        System.out.println("After..");
    }

    @AfterReturning(value = "publicTarget()", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue) throws Throwable {
        System.out.println("AfterReturning.." + returnValue);
    }

    @AfterThrowing(value = "publicTarget()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) throws Throwable {
        System.out.printf("afterThrowing");
        e.printStackTrace();
    }

    @Around("publicTarget()") // pointcut의 경로로 유효범위 적용
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Signature sig = joinPoint.getSignature(); // 호출된 메서드의 정의 정보 시그니처(메서드에 대한 정보)
        System.out.println(sig.toLongString());

        Object[] args = joinPoint.getArgs(); //인수정보
        System.out.println(Arrays.toString(args));

        Object obj = joinPoint.getTarget(); //호출한 메서드를 가지고 있는 객체의 정보
        System.out.println(obj.getClass());

        long stime = System.nanoTime(); //공통 기능
        try {

            Object result = joinPoint.proceed(); //핵심 기능 대신 실행 - factorial
            boolean re = false;
            if(!re){
                throw new RuntimeException("에외 테스트...");
            }
            return result;
        }finally {
            long etime = System.nanoTime(); //공통 기능
            System.out.println(etime - stime);
        }
    }
}
