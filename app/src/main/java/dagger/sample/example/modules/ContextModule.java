package dagger.sample.example.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Create this module as context is most widely used so once create through this
 * module and re-use it all over the app.
 */
@Module
public class ContextModule {

    private Context context;

    /*Since constructor is used here so add this when creating a component,
    if constructor is not defined than no need to add to component.
     */
    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    Context getContext() {
        return context;
    }
}
