package com.example.figmademo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv_DienThoai;
    int index = R.drawable.vsmart_live_xanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnChonMau = findViewById(R.id.button_ChonMau);
         iv_DienThoai = findViewById(R.id.imageView_DienThoai);


        btnChonMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 9);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 9 && resultCode == RESULT_OK) {
            index = data.getIntExtra("index", R.drawable.vsmart_live_xanh);
            iv_DienThoai.setImageResource(index);
        }
    }
}