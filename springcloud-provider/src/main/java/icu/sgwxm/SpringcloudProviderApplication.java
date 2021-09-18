package icu.sgwxm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("icu.sgwxm.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderApplication.class, args);
    }

}
