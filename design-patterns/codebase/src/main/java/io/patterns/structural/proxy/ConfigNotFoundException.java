package io.patterns.structural.proxy;

public class ConfigNotFoundException extends RuntimeException {

    public ConfigNotFoundException(String key) {
        super("The following property doesn't exist yet: " + key);
    }
}
