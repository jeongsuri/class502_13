package exam02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CalculatorHandler implements InvocationHandler {

    private Object obj;
    public CalculatorHandler(Object obj) {
        this.obj = obj;
    }

    /**
     * @param proxy the proxy instance that the method was invoked on
     * @param method : 호출한 메서드의 정보
     *               동적 메서드 호출 method.invoke(...)
     *
     * @param args : 메서드 호출시 넘겨준 값(인수)
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass());
        long stime = System.nanoTime(); //공통 기능
        try {
            Object result = method.invoke(obj, args); //핵심 기능 proxy 가 대신 수행
            return result;
        }finally {
            long etime = System.nanoTime(); //공통 기능
            System.out.printf("걸린시간 : %d%n", etime - stime);
        }
    }
}
