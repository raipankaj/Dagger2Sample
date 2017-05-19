package dagger.sample.example;

import android.app.Application;

import dagger.sample.example.component.DaggerMyComponent;
import dagger.sample.example.component.MyComponent;
import dagger.sample.example.modules.ContextModule;

public class MyApplication extends Application {

    private static MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        myComponent = DaggerMyComponent.builder()
                .contextModule(new ContextModule(getApplicationContext()))
                .build();
    }

    public static MyComponent getComponent() {
        return myComponent;
    }
}
