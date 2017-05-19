package dagger.sample.example.model;

import android.util.LruCache;

import javax.inject.Inject;

public class LruCacheModel {

    private LruCache<String, String> lruCache;

    @Inject
    public LruCacheModel(LruCache<String, String> lruCache) {
        this.lruCache = lruCache;
    }

    public void addData(String key, String value) {
        lruCache.put(key, value);
    }

    public void clearData(String key) {
        lruCache.remove(key);
    }

    public void clearAll() {
        lruCache.evictAll();
    }
}
