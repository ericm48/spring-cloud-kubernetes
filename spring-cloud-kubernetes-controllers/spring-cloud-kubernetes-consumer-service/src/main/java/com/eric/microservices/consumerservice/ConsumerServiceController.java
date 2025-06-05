// package com.eric.microservices.consumerservice;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.eric.microservices.config.ConfigAsPropertiesTimeOut;
// import com.eric.microservices.config.ConfigAsYamlGame;
// import com.eric.microservices.config.ConfigAsYamlUI;
// import com.eric.microservices.model.GameConfig;
// import com.eric.microservices.model.TimeoutConfig;
// import com.eric.microservices.model.UIConfig;

// import lombok.extern.slf4j.Slf4j;

// /**
//  * @author Eric Manley
//  */

// @Slf4j
// @RestController
public class ConsumerServiceController {

// 	@Autowired
// 	private ConfigAsPropertiesTimeOut configAsPropertiesTimeOut;

// 	@Autowired
// 	private ConfigAsYamlGame configAsYamlGame;

// 	@Autowired
// 	private ConfigAsYamlUI configAsYamlUI;

// 	@GetMapping("/get-config/timeout")
// 	public ResponseEntity<TimeoutConfig> getTimeoutsConfiguration(){

// 		ResponseEntity<TimeoutConfig> returnValue = null;

// 		log.debug("ConfigConsumerController.getTimeoutConfiguration() Begins...");

// 		TimeoutConfig timeoutsConfig = new TimeoutConfig();

// 		if (configAsPropertiesTimeOut != null )
// 		{
// 			timeoutsConfig.setConnectionTimeoutMillis(configAsPropertiesTimeOut.getConnectionTimeoutMillis());
// 			timeoutsConfig.setReadTimeoutMillis(configAsPropertiesTimeOut.getReadTimeoutMillis());
			
// 			log.info("Retrieving TimeoutConfig [{}]", timeoutsConfig);
// 		}
// 		else
// 		{
// 			log.error("*** TimeoutConfig is NULL!!!!");
// 		}

// 		returnValue = ResponseEntity.ok(timeoutsConfig);

// 		log.debug("ConfigConsumerController.getTimeoutConfiguration() returnValue: " + returnValue);		

// 		log.debug("ConfigConsumerController.getTimeoutConfiguration() Ends...");		

// 		return (returnValue);
// 	}

// 	@GetMapping("/get-config/game")
// 	public ResponseEntity<GameConfig> getGameConfiguration(){

// 		ResponseEntity<GameConfig> returnValue = null;

// 		log.debug("ConfigConsumerController.getGameConfiguration() Begins...");

// 		GameConfig gameConfig = new GameConfig();

// 		if (configAsYamlGame != null )
// 		{
// 			gameConfig.setLives(configAsYamlGame.getLives());
// 			gameConfig.setEnemiesName(configAsYamlGame.getEnemiesName());
// 			gameConfig.setEnemiesCheatLevel(configAsYamlGame.getEnemiesCheatLevel());
// 			gameConfig.setSecretCodePassphrase(configAsYamlGame.getSecretCodePassphrase());
// 			gameConfig.setSecretCodeAllowed(configAsYamlGame.isSecretCodeAllowed());
// 			gameConfig.setSecretCodeLives(configAsYamlGame.getSecretCodeLives());
			
// 			log.info("Retrieving gameConfig [{}]", gameConfig);
// 		}
// 		else
// 		{
// 			log.error("*** GameConfig is NULL!!!!");
// 		}

// 		returnValue = ResponseEntity.ok(gameConfig);

// 		log.debug("ConfigConsumerController.getGameConfiguration() returnValue: " + returnValue);		

// 		log.debug("ConfigConsumerController.getGameConfiguration() Ends...");		

// 		return (returnValue);
// 	}

// 	@GetMapping("/get-config/ui")
// 	public ResponseEntity<UIConfig> getUIConfiguration(){

// 		ResponseEntity<UIConfig> returnValue = null;

// 		log.debug("ConfigConsumerController.getUIConfiguration() Begins...");

// 		UIConfig uiConfig = new UIConfig();

// 		if (configAsYamlUI != null )
// 		{
// 			uiConfig.setColorGood(configAsYamlUI.getColorGood());
// 			uiConfig.setColorBad(configAsYamlUI.getColorBad());			
// 			uiConfig.setAllowTextMode(configAsYamlUI.isAllowTextMode());			
// 			uiConfig.setHowNiceToLook(configAsYamlUI.getHowNiceToLook());			

			
// 			log.info("Retrieving uiConfig [{}]", uiConfig);
// 		}
// 		else
// 		{
// 			log.error("*** uiConfig is NULL!!!!");
// 		}

// 		returnValue = ResponseEntity.ok(uiConfig);

// 		log.debug("ConfigConsumerController.getUIConfiguration() returnValue: " + returnValue);		

// 		log.debug("ConfigConsumerController.getUIConfiguration() Ends...");		

// 		return (returnValue);
// 	}


}
