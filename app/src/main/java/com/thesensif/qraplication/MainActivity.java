package com.thesensif.qraplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView tView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button BScan = findViewById(R.id.BScan);
        BScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scanActivity = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(scanActivity);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            String qr = getIntent().getExtras().getString("qr");
            tView = findViewById(R.id.textView);
            tView.setText(qr);
        } catch (Exception e) {

        }

    }
}