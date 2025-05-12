/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.eric.microservices.consumerservice;

import com.eric.microservices.config.Configuration;
import com.eric.microservices.model.TimeoutConfig;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.kubernetes.client.discovery.reactive.KubernetesInformerReactiveDiscoveryClient;
import org.springframework.cloud.kubernetes.commons.discovery.DefaultKubernetesServiceInstance;
import org.springframework.cloud.kubernetes.commons.discovery.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;

/**
 * @author Eric Manley
 */

@Slf4j
@RestController
public class ConsumerServiceController {

	private Configuration configuration;

	@GetMapping("/get-config")
	public ResponseEntity<TimeoutConfig> getTimeoutConfiguration(){

		ResponseEntity<TimeoutConfig> returnValue = null;

		log.debug("ConfigConsumerController.getTimeoutConfiguration() Begins...");

		TimeoutConfig timeoutConfig = new TimeoutConfig();
		timeoutConfig.setConnectionTimeoutMillis(configuration.getConnectionTimeoutMillis());
		timeoutConfig.setReadTimeoutMillis(configuration.getReadTimeoutMillis());

		log.info("Retrieving TimeoutConfig [{}]", timeoutConfig);

		returnValue = ResponseEntity.ok(timeoutConfig);

		log.debug("ConfigConsumerController.getTimeoutConfiguration() returnValue: " + returnValue);		

		log.debug("ConfigConsumerController.getTimeoutConfiguration() Ends...");		

		return (returnValue);
	}

}
