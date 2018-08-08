package com.tankbing.packagingdemo.controller;

import com.tankbing.packagingdemo.config.EnvProperties;
import com.tankbing.packagingdemo.config.MessageConfigProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tankbing
 * @since 2018-08-07 09:33
 */
@RestController
public class HelloController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @Autowired
    private MessageConfigProperties messageConfigProperties;

    @Autowired
    private EnvProperties envProperties;

    @GetMapping("/")
    public String index() {
        String greetingsMessage = messageConfigProperties.getGreetings();
        String env = envProperties.getEnv();
        String name = envProperties.getName();
        String introduce = envProperties.getIntroduce();
        String br = "<br>";
        String message = greetingsMessage + br + env + br + name + br + introduce;
        LOGGER.info("Inside index() method, returning :" + message);

        return message;
    }
}
