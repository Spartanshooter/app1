package com.example.endevinanumero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //EditText text = (EditText)findViewById(R.id.editTextNumber);
        //String value = text.getText().toString();
        Context context = getApplicationContext();
        CharSequence text1 = "hola";
        int duration = Toast.LENGTH_SHORT;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> Toast.makeText(context, text1, duration).show());
    }
}