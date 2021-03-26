package com.clinical.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SystemPath {

    @Value("${shellPath}")
    private String shellPath;

    public String getShellPath() {
        return shellPath;
    }

    public void setShellPath(String shellPath) {
        this.shellPath = shellPath;
    }
}
