package com.learning.sb.throttling.controller;

import com.learning.sb.throttling.conf.ApplicationConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rajasekhar Reddy
 */
@RestController
@Slf4j
public class HealthCheckController {
    public static final String HEALTH_CHECK = "/healthCheck";

    @Autowired
    private ApplicationConfig applicationConfig;

}
