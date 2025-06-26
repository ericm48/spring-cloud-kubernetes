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

    @Value("${SCK_USERID}")
    private String filePathUserID;

    // This is the path to the volume-file that has the passWord.
    // Example: '/x-platform/secrets/TEST_PASSWORD1'

    @Value("${SCK_PASSWORD}")
    private String filePathPassword;

    public String getUserId1FromFile() throws IOException {

        String returnValue = null;

        if (filePathUserID != null) {

            returnValue = new String(Files.readAllBytes(Paths.get(filePathUserID)));
            log.debug("SecretReaderService.getUserId1FromFile() returnValue: " + returnValue);
        }

        return returnValue;
    }

    public String getPassword1FromFile() throws IOException {

        String returnValue = null;
        
        if (filePathUserID != null) {

            returnValue = new String(Files.readAllBytes(Paths.get(filePathPassword)));
            log.debug("SecretReaderService.getPassword1FromFile() returnValue: " + returnValue);            
        }

        return returnValue;
    }        
}