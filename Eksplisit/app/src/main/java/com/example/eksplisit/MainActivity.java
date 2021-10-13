package com.example.eksplisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnpindah;
    EditText kata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnpindah = (Button) findViewById(R.id.btn_pindah);
        kata = (EditText)findViewById(R.id.edt_txt);
        btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String katanya = kata.getText().toString();
                Intent pindah = new Intent(MainActivity.this, KeduaActivity.class);
                pindah.putExtra("data1", katanya);
                startActivity(pindah);
            }
        });
    }
}