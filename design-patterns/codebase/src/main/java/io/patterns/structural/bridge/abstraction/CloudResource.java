package io.patterns.structural.bridge.abstraction;

import io.patterns.structural.bridge.implementors.CloudProvider;

public abstract class CloudResource {

    private final CloudProvider cloudProvider;

    public CloudResource(CloudProvider cloudProvider) {
        this.cloudProvider = cloudProvider;
    }

    abstract void subscribe(Account account);

    abstract void unsubscribe(Account account);

    abstract Invoice billing(Account account);

    CloudProvider provider() {
        return this.cloudProvider;
    }

    public static class Account {
        String identifier;
    }

    public static class Invoice {
    }
}
