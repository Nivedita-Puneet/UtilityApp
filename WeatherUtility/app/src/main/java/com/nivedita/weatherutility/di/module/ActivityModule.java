package com.nivedita.weatherutility.di.module;

import android.app.Activity;
import android.content.Context;

import com.nivedita.weatherutility.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PUNEETU on 28-03-2018.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity){
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    Activity provideActivity(){
        return mActivity;
    }
}