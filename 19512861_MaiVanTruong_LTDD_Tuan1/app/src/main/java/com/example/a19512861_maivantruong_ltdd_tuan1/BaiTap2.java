package com.example.a19512861_maivantruong_ltdd_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BaiTap2 extends AppCompatActivity {
    private double c;
    private double f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap2);
        EditText et_F = findViewById(R.id.editText_F);
        EditText et_C = findViewById(R.id.editText_C);
        Button btn_CvTF = findViewById(R.id.btn_CvF);
        Button btn_CvTC = findViewById(R.id.btn_CvC);
        Button btn_Clear = findViewById(R.id.btn_Clear);

        btn_CvTF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_C.getText().toString() != "") {
                    c = Double.parseDouble(et_C.getText().toString());
                    f = c * 9/5 + 32;
                    et_F.setText(String.valueOf(f));
                }
            }
        });
        btn_CvTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_F.getText().toString() != "") {
                    f = Double.parseDouble(et_F.getText().toString());
                    c = (f - 32) * 5/9;
                    et_C.setText(String.valueOf(c));
                }
            }
        });

        btn_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_F.setText("");
                et_C.setText("");
            }
        });

    }
}