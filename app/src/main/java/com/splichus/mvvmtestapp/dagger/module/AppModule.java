package com.splichus.mvvmtestapp.dagger.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.splichus.mvvmtestapp.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences sharedPreferences(Application application) {
        return application.getSharedPreferences(Constants.SHARED_PREF, Context.MODE_PRIVATE);
    }
}
