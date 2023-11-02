package com.rush.appstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

//        //Option 1
//        //Renames the XML file to the activity name
//        SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor edit = preferences.edit();
//        edit.putString("name", "Java");
//        edit.apply();
//
//        //Option 2
//        // Can give a name to the XML file
//        SharedPreferences preferences2 = getSharedPreferences("data",Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = preferences2.edit();
//        editor.putString("name","APP DATA FORM SHARED PREFERENCES");
//        editor.apply();
//
//        //Option 3
//        //Renames the XMP file to package name
//        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
//        SharedPreferences.Editor editor2 = sharedPreferences.edit();
//        editor2.putString("name3","App data store from 3");
//        editor2.apply();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);

        SharedPreferences.Editor editor = preferences.edit();

        Set<String> data = new HashSet<>();

        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");

        editor.putStringSet("names", data);
        editor.apply();

        Set<String> names = preferences.getStringSet("names", null);


    }
}