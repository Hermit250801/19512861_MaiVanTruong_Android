package com.example.a19512861_maivantruong_ltdd_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class BaiTap4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap4);
        EditText et_HoTen = findViewById(R.id.editText_HoTen);
        EditText et_CMND = findViewById(R.id.editText_CMND);
        RadioButton rdo_DaiHoc = findViewById(R.id.rdoDaiHoc);
        RadioButton rdo_CaoDang = findViewById(R.id.rdoCaoDang);
        RadioButton rdo_TrungCap = findViewById(R.id.rdoTrungCap);
        CheckBox cbx_DocBao = findViewById(R.id.checkBox_DocBao);
        CheckBox cbx_DocSach = findViewById(R.id.checkBox_DocSach);
        CheckBox cbx_DocCode = findViewById(R.id.checkBox_DocCode);
        Button btnGui = findViewById(R.id.btnGui);
        TextView tv_ThongBao = findViewById(R.id.textView_ThongBao);

        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et_HoTen.getText().toString().trim().length() == 0 || et_HoTen.getText().toString().trim().length() < 3) {
                    tv_ThongBao.setText("Họ tên không được để trống hoặc ít hơn 3 kí tự");
                }

                else if(et_CMND.getText().toString().trim().length() < 9) {
                    tv_ThongBao.setText("CMND phải có 9 chữ số");
                }

                else if(
                        cbx_DocBao.isChecked() == false && cbx_DocSach.isChecked() == false
                        || cbx_DocBao.isChecked() == false && cbx_DocCode.isChecked() == false
                        || cbx_DocSach.isChecked() == false && cbx_DocCode.isChecked() == false
                ) {
                    tv_ThongBao.setText("Sở thích ít nhất 2 checkbox");
                } else {
                    tv_ThongBao.setText("Thông báo");
                }
            }
        });
    }
}