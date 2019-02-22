package com.splichus.mvvmtestapp.dagger.module;

import com.splichus.mvvmtestapp.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector()
    abstract MainActivity bindMainActivity();
}
