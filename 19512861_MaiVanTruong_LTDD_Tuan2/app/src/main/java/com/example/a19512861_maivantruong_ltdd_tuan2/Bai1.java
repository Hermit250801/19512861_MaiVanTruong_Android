package com.example.a19512861_maivantruong_ltdd_tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Bai1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        Toast.makeText(Bai1.this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }
}