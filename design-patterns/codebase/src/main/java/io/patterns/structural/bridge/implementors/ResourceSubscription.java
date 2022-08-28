package io.patterns.structural.bridge.implementors;

import io.patterns.structural.bridge.abstraction.CloudResource;

class ResourceSubscription {
    CloudResource.Account account;
    CloudProvider.VendorService service;
    long timestamp;

    ResourceSubscription(CloudResource.Account account, CloudProvider.VendorService service, long timestamp) {
        this.account = account;
        this.service = service;
        this.timestamp = timestamp;
    }
}
