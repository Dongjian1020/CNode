package org.cnodejs.android.md.app;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;

import net.danlew.android.joda.BuildConfig;
import net.danlew.android.joda.JodaTimeAndroid;

/**
 * Created by jiangdongjian on 2017/6/14.
 */

public class AppController  extends Application implements Thread.UncaughtExceptionHandler{

    @Override
    public void onCreate() {
        super.onCreate();

        JodaTimeAndroid.init(this);

        if (!BuildConfig.DEBUG) {
            Thread.setDefaultUncaughtExceptionHandler(this);
        }

        MobclickAgent.setDebugMode(BuildConfig.DEBUG);
        MobclickAgent.setCheckDevice(false);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        // TODO: 17/6/30  
    }
}
