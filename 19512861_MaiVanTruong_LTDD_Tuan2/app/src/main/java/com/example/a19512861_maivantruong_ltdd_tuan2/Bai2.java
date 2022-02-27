package com.example.a19512861_maivantruong_ltdd_tuan2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        EditText et_TaiKhoan = findViewById(R.id.editText_TaiKhoan);
        EditText et_MatKhau = findViewById(R.id.editText_MatKhau);
        CheckBox chkLuuThongTin = findViewById(R.id.checkbox_LuuThongTin);
        Button btnDangNhap = findViewById(R.id.btnDangNhap);
        Button btnThoat = findViewById(R.id.btnThoat);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(view.getContext());
                mydialog.setTitle("Thông báo");
                if(et_TaiKhoan.getText().toString().trim().length() == 0) {
                    mydialog.setMessage("Vui lòng nhâp thông tin tài khoản");
                } else if(et_MatKhau.getText().toString().trim().length() == 0) {
                    mydialog.setMessage("Vui lòng nhâp thông tin mật khẩu");
                } else if (chkLuuThongTin.isChecked()) {
                    mydialog.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                } else {
                    mydialog.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
                mydialog.setNegativeButton("OK", null);
                mydialog.show();
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mydialog = new AlertDialog.Builder(view.getContext());
                mydialog.setTitle("Thông báo");
                mydialog.setMessage("Bạn có muốn thoát không?");
                mydialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });
                mydialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                mydialog.show();
            }
        });

    }
}