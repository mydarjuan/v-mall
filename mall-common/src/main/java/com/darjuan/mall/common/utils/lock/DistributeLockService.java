package com.darjuan.mall.common.utils.lock;

public interface DistributeLockService {

    boolean lock(String key, String value, long secondTimeout);

    void unlock(String key, String value);
}
