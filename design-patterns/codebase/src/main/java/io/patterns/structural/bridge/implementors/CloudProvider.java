package io.patterns.structural.bridge.implementors;

import io.patterns.structural.bridge.abstraction.CloudResource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface CloudProvider {

    List<ResourceSubscription> subscriptions = new ArrayList<>();

    static void addSubscription(CloudResource.Account account, VendorService vendorService) {
        synchronized (CloudProvider.class) {
            subscriptions.add(
                    new ResourceSubscription(account, vendorService, new Date().getTime()));
        }

    }

    static void removeSubscription(CloudResource.Account account, VendorService vendorService) {
        synchronized (CloudProvider.class) {
            subscriptions.removeIf(s -> s.account.equals(account) && s.service == vendorService);
        }
    }

    void allocateStorage(CloudResource.Account account);

    void freeStorage(CloudResource.Account account);

    CloudResource.Invoice storageBilling(CloudResource.Account account);


    void acquireMachine(CloudResource.Account account);

    void releaseMachine(CloudResource.Account account);

    CloudResource.Invoice machineBilling(CloudResource.Account account);

    enum VendorService {
        AWS_ELASTIC_COMPUTE_CLOUD,
        AWS_ELASTIC_BLOCK_STORE,
        GCP_COMPUTE_ENGINE,
        GCP_PERSISTENT_DISK;
    }
}
