package io.patterns.structural.proxy;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * Proxy Class to remote redis repository
 **/
public class CachedConfigRepository implements ConfigurationRepository {

    private final Cache<String, String> localCache;
    private final ConfigurationRepository delegate;

    public CachedConfigRepository(ConfigurationRepository delegate) {
        this.delegate = delegate;
        this.localCache = CacheBuilder.newBuilder()
                .maximumSize(5000)
                .expireAfterAccess(1, TimeUnit.HOURS)
                .build();
    }

    @Override
    public String valueOf(String key) {
        try {
            return localCache.get(key, () -> delegate.valueOf(key));
        } catch (Exception e) {
            // throw new ConfigNotFoundException(key);
            return "Not found";
        }
    }
}
