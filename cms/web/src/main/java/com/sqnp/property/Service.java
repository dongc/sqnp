package com.sqnp.property;

import org.springframework.stereotype.Component;

/**
 * Created by dongc on 2017/6/6.
 */
@Component
public class Service {

    private final String message;

    public Service(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }
}
