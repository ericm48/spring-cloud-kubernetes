package com.eric.microservices.consumerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.microservices.config.ConfigAsPropertiesTimeOuts;
import com.eric.microservices.model.TimeoutsConfig;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Eric Manley
 */

@Slf4j
@RestController
public class ConsumerServiceController {

	@Autowired
	private ConfigAsPropertiesTimeOuts configAsPropertiesTimeOuts;

	@GetMapping("/get-config/timeouts")
	public ResponseEntity<TimeoutsConfig> getTimeoutsConfiguration(){

		ResponseEntity<TimeoutsConfig> returnValue = null;

		log.debug("ConfigConsumerController.getTimeoutsConfiguration() Begins...");

		TimeoutsConfig timeoutsConfig = new TimeoutsConfig();

		if (configAsPropertiesTimeOuts != null )
		{
			timeoutsConfig.setConnectionTimeoutMillis(configAsPropertiesTimeOuts.getConnectionTimeoutMillis());
			timeoutsConfig.setReadTimeoutMillis(configAsPropertiesTimeOuts.getReadTimeoutMillis());
			
			log.info("Retrieving TimeoutConfig [{}]", timeoutsConfig);
		}
		else
		{
			log.error("*** TimeoutConfig is NULL!!!!");
		}

		returnValue = ResponseEntity.ok(timeoutsConfig);

		log.debug("ConfigConsumerController.getTimeoutsConfiguration() returnValue: " + returnValue);		

		log.debug("ConfigConsumerController.getTimeoutsConfiguration() Ends...");		

		return (returnValue);
	}

}
