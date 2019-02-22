package com.splichus.mvvmtestapp.dagger;

import android.app.Application;

import com.splichus.mvvmtestapp.MVVMTestApp;
import com.splichus.mvvmtestapp.dagger.module.ActivityBuilder;
import com.splichus.mvvmtestapp.dagger.module.AppModule;
import com.splichus.mvvmtestapp.dagger.module.FragmentBuilder;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,
                      AppModule.class,
                      ActivityBuilder.class,
                      FragmentBuilder.class})

public interface AppComponent extends AndroidInjector<MVVMTestApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(MVVMTestApp mvvmTestApp);
}
