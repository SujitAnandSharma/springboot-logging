package com.quppler.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/log")
public class LoggingController {

    private static final Logger log = LogManager.getLogger(LoggingController.class);

    @GetMapping("/getException")
    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception ex) {
            log.error("Exception -", ex);
            ex.printStackTrace();
        }
    }

    @GetMapping("/getGreeting")
    public String getResponse(@RequestParam("name") String name) {
        log.debug("REQUESTED PARAM" + name);
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        return "Welcome to the world of microservices: " + name;
    }

}
