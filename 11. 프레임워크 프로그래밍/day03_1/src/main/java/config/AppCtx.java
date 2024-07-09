package config;

import exam01.Calculator;
import exam01.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true) //AOP 자동 설정 애노테이션,  인터페이스 기반 -> 서브클래스 기반 프록시 변경
public class AppCtx {

    @Bean
    public ProxyCache proxyCache(){
        return new ProxyCache();
    }

    @Bean
    public ProxyCalculator2 proxyCalculator2(){
        return new ProxyCalculator2();
    }

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }

}
