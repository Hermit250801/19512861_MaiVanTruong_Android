package com.example.a19512861_maivantruong_ltdd_tuan3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class Bai1 extends AppCompatActivity {

    private Button btnNhap;
    private ImageButton btnRemoveAll;
    private EditText txtMa;
    private EditText txtTen;
    private RadioGroup genderGroup;
    private ListView lvNhanVien;
    private ArrayList<NhanVien> arrNhanVien;
    private MyArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);

        btnNhap = findViewById(R.id.btnNhap);
        btnRemoveAll = (ImageButton) findViewById(R.id.imageButton_RemoveAll);
        txtMa = (EditText)findViewById(R.id.editText_MaNV);
        txtTen = (EditText)findViewById(R.id.editText_TenNV);
        genderGroup = (RadioGroup)findViewById(R.id.radioGroup_Gender);

        lvNhanVien = (ListView)findViewById(R.id.listView_DanhSach);
        arrNhanVien = new ArrayList<NhanVien>();
        adapter = new MyArrayAdapter(this, R.layout.my_item_layout, arrNhanVien);
        lvNhanVien.setAdapter(adapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyNhap();
            }
        });

        btnRemoveAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xuLyXoa();
            }
        });
    }

    public void xuLyNhap() {
        String ma = txtMa.getText() + "";
        String ten = txtTen.getText() + "";
        boolean gioiTinh = false;
        NhanVien nv = new NhanVien();
        AlertDialog.Builder messageDialog = new AlertDialog.Builder(this);
        messageDialog.setTitle("Thông báo");

        if(genderGroup.getCheckedRadioButtonId() == R.id.radioButton_Nu) {
            gioiTinh = true;
        }

        if(txtMa.getText().toString().equals("")) {
            messageDialog.setMessage("Vui lòng nhập mã nhân viên");
            messageDialog.setNegativeButton("Ok", null);
            messageDialog.show();
        } else if(txtTen.getText().toString().equals("")) {
            messageDialog.setMessage("Vui lòng nhập tên nhân viên");
            messageDialog.setNegativeButton("Ok", null);
            messageDialog.show();
        } else {
            nv.setId(ma);
            nv.setName(ten);
            nv.setGender(gioiTinh);

            arrNhanVien.add(nv);

            adapter.notifyDataSetChanged();
            txtMa.setText("");
            txtTen.setText("");
            txtMa.requestFocus();
        }

    }
    public void xuLyXoa() {
        for(int i = lvNhanVien.getChildCount() - 1; i >= 0; i--) {
            View v = lvNhanVien.getChildAt(i);
            CheckBox chk = (CheckBox)v.findViewById(R.id.chk_item);

            if(chk.isChecked()) {
                arrNhanVien.remove(i);
            }
        }
        adapter.notifyDataSetChanged();
    }
}