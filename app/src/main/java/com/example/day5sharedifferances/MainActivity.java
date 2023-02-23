package com.example.day5sharedifferances;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    SharedPreferences sf;
    SharedPreferences.Editor editor;

    // 3 = always there will be a intermediate !

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editTextTextPersonName);
        sf = getSharedPreferences("name", MODE_PRIVATE);
        editor = sf.edit();
    }

    public void click(View view) {

        startActivity(new Intent(MainActivity.this, MainActivity2.class));

        String s = et.getText().toString();

        editor.putString("NameData", s);
        editor.commit();
//
//        Toast.makeText(this, "data saved", Toast.LENGTH_SHORT).show();

    }
}