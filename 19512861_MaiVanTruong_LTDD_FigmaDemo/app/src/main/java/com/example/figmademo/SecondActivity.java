package com.example.figmademo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    int index = R.drawable.vsmart_live_xanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView iv_MauBac = findViewById(R.id.imageView_MauBac);
        ImageView iv_MauDo = findViewById(R.id.imageView_MauDo);
        ImageView iv_MauDen = findViewById(R.id.imageView_MauDen);
        ImageView iv_MauXanh = findViewById(R.id.imageView_MauXanh);
        ImageView iv_MauDT = findViewById(R.id.imageView_MauDT);
        TextView tv_MauDT = findViewById(R.id.textView_MauDT);
        Button btnXong = findViewById(R.id.button_xong);

        iv_MauBac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_MauDT.setImageResource(R.drawable.vs_bac);
                index = R.drawable.vs_bac;
                tv_MauDT.setText("Bạc");
            }
        });

        iv_MauDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_MauDT.setImageResource(R.drawable.vs_red);
                index = R.drawable.vs_red;
                tv_MauDT.setText("Đỏ");
            }
        });

        iv_MauDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_MauDT.setImageResource(R.drawable.vsmart_black_star);
                index = R.drawable.vsmart_black_star;
                tv_MauDT.setText("Đen");
            }
        });

        iv_MauXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_MauDT.setImageResource(R.drawable.vsmart_live_xanh);
                index = R.drawable.vsmart_live_xanh;
                tv_MauDT.setText("Xanh");
            }
        });

        btnXong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("index", index);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}