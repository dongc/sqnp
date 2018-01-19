package com.sqnp.common.redis;

/**
 * redis service
 */
public interface IRedisService {

    /**
     * get
     *
     * @param key
     * @return
     */
    String get(String key);

    /**
     * set
     *
     * @param key
     * @param val
     * @return
     */
    boolean set(String key, String val);

    /**
     * set Object
     *
     * @param key
     * @param val
     * @return
     */
    boolean set(String key, Object val);

}
