package com.example.eksplisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class KeduaActivity extends AppCompatActivity {

    TextView txtkoper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        txtkoper =(TextView) findViewById(R.id.txt_koper);
        Intent datanya = getIntent();
        String tulisannya = datanya.getStringExtra("data1");
        txtkoper.setText(tulisannya);
    }
}