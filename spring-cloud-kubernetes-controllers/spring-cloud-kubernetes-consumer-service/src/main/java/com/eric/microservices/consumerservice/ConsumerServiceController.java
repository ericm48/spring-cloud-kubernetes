package com.eric.microservices.consumerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.microservices.config.ConfigProperties;
import com.eric.microservices.model.TimeoutConfig;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Eric Manley
 */

@Slf4j
@RestController
public class ConsumerServiceController {

	@Autowired
	private ConfigProperties configProperties;

	
	@GetMapping("/get-config")
	public ResponseEntity<TimeoutConfig> getTimeoutConfiguration(){

		ResponseEntity<TimeoutConfig> returnValue = null;

		log.debug("ConfigConsumerController.getTimeoutConfiguration() Begins...");

		TimeoutConfig timeoutConfig = new TimeoutConfig();
		timeoutConfig.setConnectionTimeoutMillis(configProperties.getConnectionTimeoutMillis());
		timeoutConfig.setReadTimeoutMillis(configProperties.getReadTimeoutMillis());

		log.info("Retrieving TimeoutConfig [{}]", timeoutConfig);

		returnValue = ResponseEntity.ok(timeoutConfig);

		log.debug("ConfigConsumerController.getTimeoutConfiguration() returnValue: " + returnValue);		

		log.debug("ConfigConsumerController.getTimeoutConfiguration() Ends...");		

		return (returnValue);
	}

}
