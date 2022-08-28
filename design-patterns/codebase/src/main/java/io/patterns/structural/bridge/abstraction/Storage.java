package io.patterns.structural.bridge.abstraction;

import io.patterns.structural.bridge.implementors.CloudProvider;

class Storage extends CloudResource {


    public Storage(CloudProvider cloudProvider) {
        super(cloudProvider);
    }

    @Override
    public void subscribe(Account account) {
        provider().allocateStorage(account);
    }

    @Override
    public void unsubscribe(Account account) {
        provider().freeStorage(account);

    }

    @Override
    public Invoice billing(Account account) {
        return provider().storageBilling(account);
    }
}
