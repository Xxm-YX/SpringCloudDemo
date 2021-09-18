package icu.sgwxm.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Appconfig {

    /**
     * 注入 restTemplate,请求rest接口
     */
    @Bean
    /**
     * 标注此注解后，RestTemplate就具有客户端负载均衡能力
     * 负载均衡技术依赖于Ribbon组件
     * RestTemplate都塞入一个loadBalancerInterceptor 让其具备有负载均衡的能力
     */
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
