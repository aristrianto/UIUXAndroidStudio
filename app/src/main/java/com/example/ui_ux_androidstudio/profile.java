package com.example.ui_ux_androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class profile extends AppCompatActivity {
    ImageView home;
    ImageView abs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        abs = (ImageView) findViewById(R.id.imageView16);

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, presensi.class));
            }
        });
        home = (ImageView) findViewById(R.id.imageView11);
        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profile.this, dashboard.class));
            }
        });

    }
}