package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7uie8GqjHmUoEwQEKWkbWx0WDaFkJhivHYrO77mi")
                .clientKey("ALUAvInn1IDNcvdaM2a0oOlWbT0Tg7XbbvKHQSjn")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
