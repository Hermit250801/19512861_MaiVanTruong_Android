package com.example.a19512861_maivantruong_ltdd_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class BaiTap6 extends AppCompatActivity {
    String [] ten;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ten = getResources().getStringArray(R.array.ten);
        setContentView(R.layout.activity_bai_tap6);
        TextView tv_Item = findViewById(R.id.textView_Item);
        ListView lv_Ten = findViewById(R.id.listView_Ten);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ten);
        lv_Ten.setAdapter(adapter);
        lv_Ten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String s =lv_Ten.getItemAtPosition(i).toString();
                tv_Item.setText("Vị trí: " + i + " Giá trị: " + s);
            }
        });
    }
}