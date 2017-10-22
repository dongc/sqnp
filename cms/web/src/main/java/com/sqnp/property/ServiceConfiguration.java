package com.sqnp.property;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dongc on 2017/6/6.
 */
@Configuration
@EnableConfigurationProperties(ServiceProperties.class)
public class ServiceConfiguration {

    @Bean
    public Service service(ServiceProperties properties) {
        return new Service(properties.getMessage());
    }

}
