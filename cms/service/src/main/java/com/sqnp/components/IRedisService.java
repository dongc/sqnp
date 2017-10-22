package com.sqnp.components;

/**
 * Created by dongc on 2017/8/16.
 */
public interface IRedisService {

    String get(String key);

    boolean set(String key, String val);

    boolean set(String key, Object val);


}
