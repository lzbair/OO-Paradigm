package io.patterns.structural.proxy;

import java.util.Scanner;

public class ConfigurationView {

    private final ConfigurationRepository config;

    public ConfigurationView(ConfigurationRepository config) {
        this.config = config;
    }

    public static void main(String[] args) {
        ConfigurationView view =
                new ConfigurationView( // Client Object
                        new CachedConfigRepository( // Proxy Object
                                new RedisConfigRepository())); // Real destination Object
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Looking for :");
                view.display(scanner.nextLine());
            }
        }

    }

    void display(String property) {
        System.out.println(config.valueOf(property));
    }
}
