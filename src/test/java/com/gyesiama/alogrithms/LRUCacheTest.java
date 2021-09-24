package com.gyesiama.alogrithms;

import com.gyesiama.algorithms.LRUCache;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LRUCacheTest {
    LRUCache<Integer, Integer> cache = new LRUCache<>(4);

    @Test
    public void evictLeastRecentUsed() {
        cache.set(1, 11);
        cache.set(2, 22);
        cache.set(3, 33);
        cache.set(4, 44);
        cache.set(5, 55);

        Assert.assertNull(cache.get(1));
        Assert.assertEquals(22, cache.get(2).intValue());
        Assert.assertEquals(33, cache.get(3).intValue());
        Assert.assertEquals(44, cache.get(4).intValue());
        Assert.assertEquals(55, cache.get(5).intValue());

        cache.set(6, 66);

        Assert.assertNull(cache.get(1));
        Assert.assertNull(cache.get(1));
    }
}
