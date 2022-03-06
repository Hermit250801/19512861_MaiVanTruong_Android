package com.example.a19512861_maivantruong_ltdd_tuan3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Bai2 extends AppCompatActivity {

    Spinner spinDM;
    EditText et_MaSP, et_TenSP;
    Button btnNhapSP;
    ListView lvSP;

    ArrayList<Catalog> arrSpinner = new ArrayList<Catalog>();
    ArrayAdapter<Catalog> adapterSpinner = null;

    ArrayList<Product> arrListView = new ArrayList<Product>();
    ArrayAdapter<Product> adapterListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        getWidgetsControl();
        fakeDataCatalog();
        addEventsForFormWidgets();
    }

    private void getWidgetsControl() {
        spinDM = (Spinner) findViewById(R.id.spinner_SP);
        et_MaSP = (EditText) findViewById(R.id.editText_MaSP);
        et_TenSP = (EditText) findViewById(R.id.editText_TenSP);
        btnNhapSP = (Button) findViewById(R.id.btnNhapSp);
        lvSP = (ListView) findViewById(R.id.listView_SanPham);

        adapterSpinner = new ArrayAdapter<Catalog>(this, android.R.layout.simple_spinner_item, arrSpinner);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinDM.setAdapter(adapterSpinner);

        adapterListView = new ArrayAdapter<Product>(this, android.R.layout.simple_list_item_1, arrListView);
        lvSP.setAdapter(adapterListView);
    }

    private void fakeDataCatalog() {
        Catalog cat1 = new Catalog("1", "SamSung");
        Catalog cat2 = new Catalog("2", "Iphone");
        Catalog cat3 = new Catalog("3", "Ipad");

        arrSpinner.add(cat1);
        arrSpinner.add(cat2);
        arrSpinner.add(cat3);

        adapterSpinner.notifyDataSetChanged();
    }

    private void addEventsForFormWidgets() {
        btnNhapSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder messageDialog = new AlertDialog.Builder(v.getContext());
                messageDialog.setTitle("Thông báo");
                if(et_MaSP.getText().toString().trim().equals("")) {
                    messageDialog.setMessage("Vui lòng nhập mã sản phẩm!");
                    messageDialog.setNegativeButton("Ok", null);
                    messageDialog.show();
                } else if(et_TenSP.getText().toString().trim().equals("")) {
                    messageDialog.setMessage("Vui lòng nhập tên sản phẩm!");
                    messageDialog.setNegativeButton("Ok", null);
                    messageDialog.show();
                } else {
                    addProductForDatalog();
                    et_MaSP.setText("");
                    et_TenSP.setText("");
                    et_MaSP.requestFocus();
                }

            }
        });
        spinDM.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                loadListProductByCatalog(arrSpinner.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void addProductForDatalog() {
        Product p = new Product();
        p.setId(et_MaSP.getText().toString());
        p.setName(et_TenSP.getText().toString());
        Catalog c = (Catalog) spinDM.getSelectedItem();
        c.addProduct(p);
        loadListProductByCatalog(c);
    }

    private void loadListProductByCatalog(Catalog c) {
        arrListView.clear();
        arrListView.addAll(c.getListProduct());
        adapterListView.notifyDataSetChanged();
    }
}