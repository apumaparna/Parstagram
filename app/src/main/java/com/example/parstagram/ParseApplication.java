package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JQ4HjICir99zNv1Vrb01Vh546FfwyYdQa4YtRbyJ")
                .clientKey("yNO1OhCIOMnT4Pc8VoekJjf0G9YBvOLBLPSTgC7p")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
