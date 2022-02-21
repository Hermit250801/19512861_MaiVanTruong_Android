package com.example.a19512861_maivantruong_ltdd_tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bai3 extends AppCompatActivity {
    private ArrayList<String> myList;
    private ArrayAdapter<String> adapter;
    private EditText et_Ten;
    private ListView listViewTen;
    private Button btnNhap;
    private TextView tv_KetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        et_Ten = findViewById(R.id.editText_Ten);
        myList = new ArrayList<String>();
        myList.add("Bin");
        myList.add("Teo");
        myList.add("Ty");
        listViewTen = findViewById(R.id.listView_Ten);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , myList);
        listViewTen.setAdapter(adapter);

        btnNhap = findViewById(R.id.btnNhap);
        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myList.add(et_Ten.getText() + "");
                adapter.notifyDataSetChanged();
            }
        });

        tv_KetQua = findViewById(R.id.textView_KetQua);
        listViewTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "position: " + i;
                msg += "; value:  " + adapterView.getItemAtPosition(i).toString();

                tv_KetQua.setText(msg);
            }
        });
    }
}