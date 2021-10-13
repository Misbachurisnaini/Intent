package com.example.implisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText notelp;
    private EditText alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notelp = (EditText) findViewById(R.id.notelp);
        alamat = (EditText) findViewById(R.id.alamat);
    }

    public void kirimSMS(View view) {
        Uri uri = Uri.parse("smsto:" +notelp.getText().toString());
        Intent sendSMS = new Intent(Intent.ACTION_SENDTO, uri);
        sendSMS.putExtra("sms_body", "Ini Implisit");
        if(sendSMS.resolveActivity(getPackageManager()) !=null) {
            startActivity(sendSMS);
        }
    }

    public void cariAlamat(View view) {
        Uri uri2 = Uri.parse("geo:0,0?q="+alamat.getText().toString());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri2);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) !=null);
        startActivity(mapIntent);
    }
}