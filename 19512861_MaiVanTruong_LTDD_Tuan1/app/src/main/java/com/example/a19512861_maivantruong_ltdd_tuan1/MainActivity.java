package com.example.a19512861_maivantruong_ltdd_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnBaiTap1 = findViewById(R.id.btnBaiTap1);
        Button btnBaiTap2 = findViewById(R.id.btnBaiTap2);
        Button btnBaiTap3 = findViewById(R.id.btnBaiTap3);
        Button btnBaiTap4 = findViewById(R.id.btnBaiTap4);
        Button btnBaiTap5 = findViewById(R.id.btnBaiTap5);
        Button btnBaiTap6 = findViewById(R.id.btnBaiTap6);

        btnBaiTap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BaiTap1.class);
                startActivity(intent);
            }
        });

        btnBaiTap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BaiTap2.class);
                startActivity(intent);
            }
        });

        btnBaiTap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BaiTap3.class);
                startActivity(intent);
            }
        });
        btnBaiTap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BaiTap4.class);
                startActivity(intent);
            }
        });

        btnBaiTap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BaiTap5.class);
                startActivity(intent);
            }
        });

        btnBaiTap6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BaiTap6.class);
                startActivity(intent);
            }
        });
    }
}