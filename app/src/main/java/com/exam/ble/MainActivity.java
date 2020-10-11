package com.exam.ble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.exam.ble.central.CentralActivity;
import com.exam.ble.peripheral.PeripheralActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnCentral, btnPeripheral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        initView();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void initView() {
        btnCentral = (Button) findViewById(R.id.btnCentral);
        btnPeripheral = (Button) findViewById(R.id.btnPeripheral);

        btnCentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CentralActivity.class));
            }
        });

        btnPeripheral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PeripheralActivity.class));
            }
        });
    }
}