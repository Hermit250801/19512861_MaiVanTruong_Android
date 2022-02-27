package com.example.a19512861_maivantruong_ltdd_tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Bai4 extends ListActivity {
    private ArrayList<String> myList;
    private ArrayAdapter<String> adapter;
    private EditText et_Ten;
    private Button btnNhap;
    private TextView tv_KetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        et_Ten = findViewById(R.id.editText_Ten2);
        tv_KetQua = findViewById(R.id.textView_KetQua2);
        myList = new ArrayList<String>();
        myList.add("Bin");
        myList.add("Teo");
        myList.add("Ty");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myList);
        setListAdapter(adapter);
        btnNhap = findViewById(R.id.btnNhap2);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myList.add(et_Ten.getText() + "");
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String)getListAdapter().getItem(position);
        tv_KetQua.setText("position: " + position + " value: " + item);
    }
}