package dagger.sample.example.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger.sample.example.model.DataBaseHandler;
import dagger.sample.example.modules.ContextModule;
import dagger.sample.example.modules.StorageModule;

@Singleton
@Component(modules = {ContextModule.class, StorageModule.class})
public interface MyComponent {
    DataBaseHandler getDataBaseHandler();
}
