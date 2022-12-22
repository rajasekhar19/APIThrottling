package com.learning.sb.throttling.filter;

import io.github.bucket4j.Bucket;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
public class ThrottlingFilter implements Filter {
    private static Map<String, Bucket> bucketCache = new ConcurrentHashMap<>();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
