package com.example.adinsta;

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
                .applicationId("AGQYaIvxUqvjt4nREPsPEeHHkyjuDLvNl9Y8qnHW")
                .clientKey("9H45J3Hsp7Q18PZPElbpu5SHKP2oSZzMO66firIA")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
