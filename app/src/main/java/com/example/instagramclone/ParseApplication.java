package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initialize Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Set applicationId, and server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configure
        // any network interceptors must b added with the Configuration Builder given this
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("S0KDrDzcWDz7eMEcUz2XuYSDVNnCYZ8wcdlnbFev")
                .clientKey("Mhuy81VImFQ4gy1NZdehprEuqcdWlRjQATCdcEPs")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
