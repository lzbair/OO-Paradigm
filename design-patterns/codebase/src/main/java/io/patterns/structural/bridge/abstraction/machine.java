package io.patterns.structural.bridge.abstraction;

import io.patterns.structural.bridge.implementors.CloudProvider;

class machine extends CloudResource {

    public machine(CloudProvider cloudProvider) {
        super(cloudProvider);
    }

    @Override
    void subscribe(Account account) {
        provider().acquireMachine(account);
    }

    @Override
    void unsubscribe(Account account) {
        provider().releaseMachine(account);
    }

    @Override
    Invoice billing(Account account) {
        return provider().machineBilling(account);
    }
}
