package com.sqnp.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by dongc on 2017/6/6.
 */
@ConfigurationProperties("service")
public class ServiceProperties {

    /**
     * A message for the service.
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
