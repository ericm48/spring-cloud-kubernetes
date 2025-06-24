package com.eric.microservices.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

@Component
public class ConfigAsSecretVolumeFile {

    private String userId1;
    private String password1;

    // Must have Vault Stuff setup, (ie Vault URI & Token)
    //@Value("${vault.secret.mount.path:/dsg-platform/secrets}") // Default mount path
    
    private String secretMountPath;

    public String readUserId1Secret() throws IOException {
        String userId1FilePath = Paths.get(secretMountPath, "TEST_ERIC_TEST_USERID1").toString();
        return Files.readString(Paths.get(userId1FilePath));
    }

    public String readPassword1Secret() throws IOException {
        String password1FilePath = Paths.get(secretMountPath, "TEST_ERIC_TEST_PASSWORD1").toString();
        return Files.readString(Paths.get(password1FilePath));
    }

}
