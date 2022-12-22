package com.learning.sb.throttling.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("webservice")
@Getter
@Setter
public class ApplicationConfig {
    private String name;
}
