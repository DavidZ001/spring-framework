package org.springframework.examples.aop;

import org.springframework.context.annotation.*;

/**
 * Created by smlz on 2019/6/10.
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
//@EnableAspectJAutoProxy(exposeProxy = true)
public class MainConfig {

    @Bean
    public Calculate calculate() {
        return new DefaultCalculate();
    }

    @Bean
    public CalculateLogAspect tulingLogAspect() {
        return new CalculateLogAspect();
    }
}
