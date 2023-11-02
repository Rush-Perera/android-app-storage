package com.rush.appstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

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
            //Renames the XML file to the activity name
//        SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor edit = preferences.edit();
//        edit.putString("name", "Java");
//        edit.apply();
//
        // Can give a name to the XML file
//        SharedPreferences preferences = getSharedPreferences("data",Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = preferences.edit();
//        editor.putString("name","APP DATA FORM SHARED PREFERENCES");
//        editor.apply();

        //Renames the XMP file to package name
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name3","App data store from 3");
        editor.apply();
    }
}