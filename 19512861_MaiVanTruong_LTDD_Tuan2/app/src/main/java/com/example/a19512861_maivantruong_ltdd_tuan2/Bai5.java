package com.example.a19512861_maivantruong_ltdd_tuan2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class Bai5 extends AppCompatActivity {
    EditText et_Id, et_Name;
    Button btnNhapNV;
    RadioGroup radGroup_LoaiNV;
    ListView lvNhanVien;
    ArrayList<Employee> arrEmployee = new ArrayList<Employee>();
    ArrayAdapter<Employee> arrAdapter = null;
    Employee employee = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);
        et_Id = findViewById(R.id.editText_MaNV);
        et_Name = findViewById(R.id.editText_TenNV);
        btnNhapNV = findViewById(R.id.btnNhapNV);
        radGroup_LoaiNV = findViewById(R.id.radioGroup_LoaiNV);

        lvNhanVien = findViewById(R.id.listView_NhanVien);
        arrAdapter = new ArrayAdapter<Employee>(this, android.R.layout.simple_list_item_1, arrEmployee);
        lvNhanVien.setAdapter(arrAdapter);

        btnNhapNV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder messageDialog = new AlertDialog.Builder(v.getContext());
                messageDialog.setTitle("Thông báo");
                if(et_Id.getText().toString().equals("")) {
                    messageDialog.setMessage("Vui lòng nhập mã nhân viên");
                    messageDialog.setNegativeButton("OK", null);
                    messageDialog.show();
                } else if(et_Name.getText().toString().equals("")) {
                    messageDialog.setMessage("Vui lòng nhập tên nhân viên");
                    messageDialog.setNegativeButton("OK", null);
                    messageDialog.show();
                } else {
                    nhap();
                    et_Id.setText("");
                    et_Name.setText("");
                    et_Id.requestFocus();
                }

            }
        });
    }

    public void nhap() {
        int radId = radGroup_LoaiNV.getCheckedRadioButtonId();
        String id = et_Id.getText().toString();
        String name = et_Name.getText().toString();
        if(radId == R.id.radioButton_ChinhThuc) {
            employee = new EmployeePFullTime();
        } else {
            employee = new EmpoyeePartTime();
        }
        employee.setId(id);
        employee.setName(name);
        arrEmployee.add(employee);
        arrAdapter.notifyDataSetChanged();
    }
}