package io.patterns.structural.bridge.implementors;

import io.patterns.structural.bridge.abstraction.CloudResource;

class Aws implements CloudProvider {
    @Override
    public void allocateStorage(CloudResource.Account account) {
        CloudProvider.addSubscription(account, VendorService.AWS_ELASTIC_BLOCK_STORE);
    }

    @Override
    public void freeStorage(CloudResource.Account account) {
        CloudProvider.removeSubscription(account, VendorService.AWS_ELASTIC_BLOCK_STORE);
    }

    @Override
    public CloudResource.Invoice storageBilling(CloudResource.Account account) {
        throw new NotImplementedYetException(); // compute billing
    }

    @Override
    public void acquireMachine(CloudResource.Account account) {
        CloudProvider.addSubscription(account, VendorService.AWS_ELASTIC_COMPUTE_CLOUD);
    }

    @Override
    public void releaseMachine(CloudResource.Account account) {
        CloudProvider.removeSubscription(account, VendorService.AWS_ELASTIC_COMPUTE_CLOUD);

    }

    @Override
    public CloudResource.Invoice machineBilling(CloudResource.Account account) {
        throw new NotImplementedYetException(); // compute billing
    }
}
