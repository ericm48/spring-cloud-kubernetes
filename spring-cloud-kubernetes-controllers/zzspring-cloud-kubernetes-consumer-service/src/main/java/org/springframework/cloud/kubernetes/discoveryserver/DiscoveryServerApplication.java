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

package org.springframework.cloud.kubernetes.discoveryserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.eric.microservices.config.ConfigAsPropertiesTimeOut;
import com.eric.microservices.config.ConfigAsYamlGame;
import com.eric.microservices.config.ConfigAsYamlUI;

/**
 * @author Ryan Baxter
 */
@SpringBootApplication
@EnableScheduling

@EnableKubernetesDiscoveryClient

@EnableConfigurationProperties({ ConfigAsPropertiesTimeOut.class, ConfigAsYamlGame.class, ConfigAsYamlUI.class })

public class DiscoveryServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DiscoveryServerApplication.class).run(args);
	}

}
