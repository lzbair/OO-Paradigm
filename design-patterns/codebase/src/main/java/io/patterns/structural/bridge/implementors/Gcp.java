package io.patterns.structural.bridge.implementors;

import io.patterns.structural.bridge.abstraction.CloudResource;

class Gcp implements CloudProvider {
    @Override
    public void allocateStorage(CloudResource.Account account) {
        CloudProvider.addSubscription(account, VendorService.GCP_PERSISTENT_DISK);
    }

    @Override
    public void freeStorage(CloudResource.Account account) {
        CloudProvider.removeSubscription(account, VendorService.GCP_PERSISTENT_DISK);
    }

    @Override
    public CloudResource.Invoice storageBilling(CloudResource.Account account) {
        throw new NotImplementedYetException(); // compute billing
    }

    @Override
    public void acquireMachine(CloudResource.Account account) {
        CloudProvider.addSubscription(account, VendorService.GCP_COMPUTE_ENGINE);
    }

    @Override
    public void releaseMachine(CloudResource.Account account) {
        CloudProvider.removeSubscription(account, VendorService.GCP_COMPUTE_ENGINE);

    }

    @Override
    public CloudResource.Invoice machineBilling(CloudResource.Account account) {
        throw new NotImplementedYetException(); // compute billing
    }
}
