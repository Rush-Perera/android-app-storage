package com.rush.appstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

//        SharedPreferences preferences = getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor edit = preferences.edit();
//        edit.putString("name", "Main Activity 2");
//        edit.apply();

        SharedPreferences preferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        String name = preferences.getString("name","Default value");

        TextView view = findViewById(R.id.textView);
        view.setText(name);

    }
}