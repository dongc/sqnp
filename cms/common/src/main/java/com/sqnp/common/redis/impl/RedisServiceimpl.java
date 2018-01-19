package com.sqnp.common.redis.impl;

import com.sqnp.common.redis.IRedisService;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by dongc on 19/01/2018.
 */
public class RedisServiceimpl implements IRedisService {

    // 此处直接注入即可
    @Autowired
    private JedisPool jedisPool;

    @Override
    public String get(String key) {
        Jedis jedis = this.jedisPool.getResource();
        String ret;
        try {
            ret = jedis.get(key);
        } finally {
            if (jedis != null)
                jedis.close();
        }
        return ret;
    }

    @Override
    public boolean set(String key, String val) {
        Jedis jedis = this.jedisPool.getResource();
        try {
            return "OK".equals(jedis.set(key, val));
        } finally {
            if (jedis != null)
                jedis.close();
        }
    }

    @Override
    public boolean set(String key, Object val) {
        Jedis jedis = this.jedisPool.getResource();
        Schema schema = RuntimeSchema.getSchema(val.getClass());

        byte[] valBytes = ProtobufIOUtil.toByteArray(val, schema, LinkedBuffer.allocate());
        try {
            return "OK".equals(jedis.set(key.getBytes(), valBytes));
        } finally {
            if (jedis != null)
                jedis.close();
        }
    }
}
