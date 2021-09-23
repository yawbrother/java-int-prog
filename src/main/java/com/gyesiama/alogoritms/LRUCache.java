package com.gyesiama.alogoritms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V>  {
    private Map<K, V> map;

    public LRUCache(int cacheSize) {
        map = new LinkedHashMap<K, V>(16, 0.75F, true) {

            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cacheSize;
            }
        };
    }

    public V get(K key) {
        return map.get(key);
    }

    public void set(K key, V value) {
        map.put(key, value);
    }
}
