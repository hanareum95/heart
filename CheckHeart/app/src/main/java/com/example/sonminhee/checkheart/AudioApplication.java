package com.example.sonminhee.checkheart;

import android.app.Application;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sonminhee.checkheart.activity.HeartCheckActivity;

/**
 * Created by sonminhee on 2017. 10. 9..
 */

public class AudioApplication extends Application {
    private static AudioApplication mInstance;
    private IAudioService mInterface;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mInterface = new IAudioService(getApplicationContext());
    }

    public static AudioApplication getInstance() {
        return mInstance;
    }

    public IAudioService getServiceInterface() {
        return mInterface;
    }

}
