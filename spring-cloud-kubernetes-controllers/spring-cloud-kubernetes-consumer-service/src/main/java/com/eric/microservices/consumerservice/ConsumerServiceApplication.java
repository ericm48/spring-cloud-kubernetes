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

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.eric.microservices.config.ConfigAsPropertiesTimeOut;
import com.eric.microservices.config.ConfigAsYamlGame;
import com.eric.microservices.config.ConfigAsYamlUI;
import com.eric.microservices.config.ConfigPassword2;
import com.eric.microservices.config.ConfigUserID2;

/**
 * @author Eric Manley
 */

@SpringBootApplication
@EnableConfigurationProperties({ ConfigAsPropertiesTimeOut.class, ConfigAsYamlGame.class, ConfigAsYamlUI.class,
		ConfigUserID2.class, ConfigPassword2.class })

@ComponentScan("com.eric")

public class ConsumerServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConsumerServiceApplication.class).run(args);
	}

}
