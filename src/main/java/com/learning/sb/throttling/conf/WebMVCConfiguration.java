package com.learning.sb.throttling.conf;

import com.learning.sb.throttling.filter.ThrottlingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Rajasekhar Reddy
 * To register Filter.
 */
@Lazy
@Configuration
public class WebMVCConfiguration {
    @Bean
    FilterRegistrationBean<ThrottlingFilter> filterRegistration() {
        FilterRegistrationBean<ThrottlingFilter> reg = new FilterRegistrationBean<>();
        reg.setFilter(new ThrottlingFilter());
        reg.addUrlPatterns("/*");
        return reg;
    }
}
