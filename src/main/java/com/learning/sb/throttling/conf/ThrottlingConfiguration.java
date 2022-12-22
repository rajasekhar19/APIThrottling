package com.learning.sb.throttling.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("throttling")
public class ThrottlingConfiguration {
    private BucketConfig read;
    private BucketConfig search;

    @Getter
    @Setter
    public static class BucketConfig {
        private Integer minute;
        private Integer hour;
        private Integer day;
    }
}
