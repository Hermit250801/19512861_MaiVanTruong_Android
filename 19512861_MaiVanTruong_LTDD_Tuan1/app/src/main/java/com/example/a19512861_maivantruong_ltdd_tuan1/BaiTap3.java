package com.example.a19512861_maivantruong_ltdd_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BaiTap3 extends AppCompatActivity {
    private int namDuong;
    private String namAm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap3);
        EditText et_NamDuongLich = findViewById(R.id.et_NamDuongLich);
        TextView et_NamAmLich = findViewById(R.id.et_NamAmLich);
        Button btnChange = findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namDuong = Integer.parseInt(et_NamDuongLich.getText().toString());
                String can = "";
                String chi = "";
                if (namDuong >= 1900) {
                    switch (namDuong % 10) {
                        case 0:
                            can = "Canh";
                            break;
                        case 1:
                            can = "Tân";
                            break;

                        case 2:
                            can = "Nhâm";
                            break;
                        case 3:
                            can = "Quý";
                            break;
                        case 4:
                            can = "Giáp";
                            break;
                        case 5:
                            can = "Ất";
                            break;
                        case 6:
                            can = "Binh";
                            break;
                        case 7:
                            can = "Đinh";
                            break;
                        case 8:
                            can = "Mậu";
                            break;
                        case 9:
                            can = "Kỳ";
                            break;
                    }
                    switch (namDuong % 12) {
                        case 0:
                            chi = "Thân";
                            break;
                        case 1:
                            chi = "Dậu";
                            break;
                        case 2:
                            chi = "Tuất";
                            break;
                        case 3:
                            chi = "Hợi";
                            break;
                        case 4:
                            chi = "Tý";
                            break;
                        case 5:
                            chi = "Sửu";
                            break;
                        case 6:
                            chi = "Dần";
                            break;
                        case 7:
                            chi = "Mẹo";
                            break;
                        case 8:
                            chi = "Thìn";
                            break;
                        case 9:
                            chi = "Tỵ";
                            break;
                        case 10:
                            chi = "Ngọ";
                            break;
                        case 11:
                            chi = "Mùi";
                            break;
                    }
                    namAm = can + " " + chi;
                    et_NamAmLich.setText(namAm);
                }
                else {
                    et_NamAmLich.setText("Vui lòng nhập năm lớn \nhơn 1900");
                }
            }
        });
    }
}