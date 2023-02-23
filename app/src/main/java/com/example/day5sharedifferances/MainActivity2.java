package com.example.day5sharedifferances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv;
    SharedPreferences sf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = findViewById(R.id.textView);

//        tv.setText("hi");

        sf = getSharedPreferences("name",MODE_PRIVATE);

        String getSharedPreferences = sf.getString("NameData", "def Value");

        tv.setText(getSharedPreferences);
    }
}