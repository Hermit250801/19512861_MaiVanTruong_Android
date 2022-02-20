package com.example.a19512861_maivantruong_ltdd_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class BaiTap5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap5);
        EditText et_TenKhachHang = findViewById(R.id.editText_TenKhachHang);
        EditText et_SoLuongSach = findViewById(R.id.editText_SoLuongSach);
        TextView tv_ThanhTien = findViewById(R.id.textView_ThanhTien);
        Button btnTinhTT = findViewById(R.id.btnTinhTT);
        Button btnTiep = findViewById(R.id.btnTiep);
        CheckBox cbxKHVIP = findViewById(R.id.checkbox_KhachVIP);

        btnTinhTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int soLuongSach = Integer.parseInt(et_SoLuongSach.getText().toString());
                double thanhTien = 20000 * soLuongSach;
                if(cbxKHVIP.isChecked()) {
                    thanhTien = thanhTien - thanhTien * 0.1;
                }

                tv_ThanhTien.setText(String.valueOf(thanhTien));
            }
        });
    }
}