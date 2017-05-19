package dagger.sample.example.modules;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.sample.example.model.DataBaseHandler;

@Singleton
@Module(includes = ContextModule.class)
public class StorageModule {

    @Provides
    @Singleton
    SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences("prefstore", Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    LruCache<String, String> getLruCache() {
        return new LruCache<>(4 * 1024 * 1024);
    }

    @Provides
    @Singleton
    DataBaseHandler getDataBaseHandler(Context context) {
        return new DataBaseHandler(context);
    }
}
