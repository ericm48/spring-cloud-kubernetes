package com.eric.microservices.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service
public class SecretReaderService {

    public String getUserId1FromFile() throws IOException {

        // Assuming the secret file is named 'TEST_ERIC_TEST_USERID1' and mounted at /dsg-platform/secrets

        String filePath = "/dsg-platform/secrets/TEST_ERIC_TEST_USERID1";
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public String getPassword1FromFile() throws IOException {

        // Assuming the secret file is named 'TEST_ERIC_TEST_PASSWORD1' and mounted at /dsg-platform/secrets

        String filePath = "/dsg-platform/secrets/TEST_ERIC_TEST_PASSWORD1";
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }        
}