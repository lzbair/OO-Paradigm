package io.patterns.structural.proxy;

import redis.clients.jedis.Jedis;

// Requires to run Redis instance: e.g. docker run -d --name demo-redis -p 6379:6379 redis
public class RedisConfigRepository implements ConfigurationRepository {

    public static final String HOST = "localhost";
    public static final int PORT = 6379;
    private final Jedis jedis;

    public RedisConfigRepository() {
        this.jedis = jedis();
    }


    @Override
    public String valueOf(String key) {
        return jedis.get(key);
    }

    private Jedis jedis() {
        Jedis remotecache = new Jedis(HOST, PORT);
        remotecache.set("testKey", "testValue");
        return remotecache;
    }
}
