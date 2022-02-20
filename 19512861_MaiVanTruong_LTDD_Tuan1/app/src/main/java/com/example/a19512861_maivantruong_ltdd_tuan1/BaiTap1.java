package com.example.a19512861_maivantruong_ltdd_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BaiTap1 extends AppCompatActivity {
    private double soA = 0;
    private double soB = 0;
    private double ketQua = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap1);
        EditText et_SoA = findViewById(R.id.editText_SoA);
        EditText et_SoB = findViewById(R.id.editText_SoB);
        TextView tv_KetQua = findViewById(R.id.textView_KetQua);
        Button btnTong = findViewById(R.id.btnTong);
        Button btnHieu = findViewById(R.id.btnHieu);
        Button btnTich = findViewById(R.id.btnTich);
        Button btnThuong = findViewById(R.id.btnThuong);
        Button btnUCLN = findViewById(R.id.btnUCLN);
        Button btnThoat = findViewById(R.id.btnThoat);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soA = Double.parseDouble(et_SoA.getText().toString());
                soB = Double.parseDouble(et_SoB.getText().toString());
                ketQua = soA + soB;
                tv_KetQua.setText(String.valueOf(ketQua));
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soA = Double.parseDouble(et_SoA.getText().toString());
                soB = Double.parseDouble(et_SoB.getText().toString());
                ketQua = soA - soB;
                tv_KetQua.setText(String.valueOf(ketQua));
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soA = Double.parseDouble(et_SoA.getText().toString());
                soB = Double.parseDouble(et_SoB.getText().toString());
                ketQua = soA * soB;
                tv_KetQua.setText(String.valueOf(ketQua));
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soA = Double.parseDouble(et_SoA.getText().toString());
                soB = Double.parseDouble(et_SoB.getText().toString());
                ketQua = soA / soB;
                tv_KetQua.setText(String.valueOf(ketQua));
            }
        });

        btnUCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soA = Double.parseDouble(et_SoA.getText().toString());
                soB = Double.parseDouble(et_SoB.getText().toString());
                if(soA == 0 || soB == 0) {
                    ketQua = 0;
                }
                while(soA != soB) {
                    if(soA > soB) {
                        soA = soA - soB;
                    } else {
                        soB = soB - soA;
                    }
                    ketQua = soA;
                }
                tv_KetQua.setText(String.valueOf(ketQua));
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}