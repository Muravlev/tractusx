package com.tractusx.uploadappadapter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sec")
public class SecurityConfiguration {
    public void setUsername(String username) {
        this.username = username;
    }

    public String username;

    public void setPassword(String password) {
        this.password = password;
    }

    public String password;
}
