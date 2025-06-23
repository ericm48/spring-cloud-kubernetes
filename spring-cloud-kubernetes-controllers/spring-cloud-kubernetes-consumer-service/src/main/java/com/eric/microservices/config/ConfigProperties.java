package com.eric.microservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

// @EnableRetry
// @Configuration
// @ConfigurationProperties(prefix = "timeout.settings")

public class ConfigProperties {

	private Integer connectionTimeoutMillis;
	private Integer readTimeoutMillis;

}
