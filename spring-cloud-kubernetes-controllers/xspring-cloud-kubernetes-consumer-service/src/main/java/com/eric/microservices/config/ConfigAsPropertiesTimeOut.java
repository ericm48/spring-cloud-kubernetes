package com.eric.microservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

@Configuration
@ConfigurationProperties(prefix = "timeout.settings")
             
public class ConfigAsPropertiesTimeOut {

	private Integer connectionTimeoutMillis;
	private Integer readTimeoutMillis;

}
