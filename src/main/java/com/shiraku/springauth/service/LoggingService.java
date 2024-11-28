package com.shiraku.springauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {
    private static final Logger logger = LoggerFactory.getLogger(LoggingService.class);

    public void logAuthenticationSuccess(String username) {
        logger.info("User {} successfully authenticated", username);
    }

    public void logLogout(String username) {
        logger.info("User {} logged out", username);
    }
}
