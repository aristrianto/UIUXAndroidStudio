package com.example.ui_ux_androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class presensi extends AppCompatActivity {
ImageView abs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presensi);
        abs = (ImageView) findViewById(R.id.imageView11);
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(presensi.this, dashboard.class));
            }
        });
    }
}