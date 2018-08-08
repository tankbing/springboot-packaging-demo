package com.tankbing.packagingdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tankbing
 * @since 2018-08-07 09:22
 */
@Component
@ConfigurationProperties(prefix = "message")
public class MessageConfigProperties {
    private String greetings;

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
}
