package com.eric.microservices.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SecretReaderService {

    // This is the path to the volume-file that has the userID.
    // Example: '/x-platform/secrets/TEST_USERID1'

    @Value("${SCK_FILE_USERID}")
    private String filePathUserID;

    // This is the path to the volume-file that has the passWord.
    // Example: '/x-platform/secrets/TEST_PASSWORD1'

    @Value("${SCK_FILE_PASSWORD}")
    private String filePathPassword;

    @Value("${SCK_EVAR_USERID}")
    private String enviromentVariableUserID;

    @Value("${SCK_EVAR_PASSWORD}")
    private String enviromentVariablePassword;

    public String getUserId1FromFile() throws IOException {

        String returnValue = null;

        if (filePathUserID != null) {

            log.debug("SecretReaderService.getUserId1FromFile() filePathUserID: " + filePathUserID);

            returnValue = new String(Files.readAllBytes(Paths.get(filePathUserID)));
            log.debug("SecretReaderService.getUserId1FromFile() returnValue: " + returnValue);
        }

        return returnValue;
    }

    public String getPassword1FromFile() throws IOException {

        String returnValue = null;

        if (filePathUserID != null) {

            log.debug("SecretReaderService.getPassword1FromFile() filePathPassword: " + filePathPassword);

            returnValue = new String(Files.readAllBytes(Paths.get(filePathPassword)));
            log.debug("SecretReaderService.getPassword1FromFile() returnValue: " + returnValue);
        }

        return returnValue;
    }
    
    public String getUserId1FromEnvironmentVariable() {
        
        log.debug("SecretReaderService.getUserId1FromEnvironmentVariable() eVar: SCK_EVAR_USERID");
        log.debug("SecretReaderService.getUserId1FromEnvironmentVariable() returnValue: " + enviromentVariableUserID);
        
        return enviromentVariableUserID;
    }

    public String getPassword1EnvironmentVariable() {

        log.debug("SecretReaderService.getPassword1EnvironmentVariable() eVar: SCK_EVAR_PASSWORD");
        log.debug("SecretReaderService.getPassword1EnvironmentVariable() returnValue: " + enviromentVariablePassword);
        
        return enviromentVariablePassword;        
    }

}