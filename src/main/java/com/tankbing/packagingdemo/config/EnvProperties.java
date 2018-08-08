package com.tankbing.packagingdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tankbing
 * @since 2018-08-07 09:22
 */
@Component
@ConfigurationProperties(prefix = "com.tankbing")
public class EnvProperties {
    private String env;
    private String name;
    private String introduce;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
