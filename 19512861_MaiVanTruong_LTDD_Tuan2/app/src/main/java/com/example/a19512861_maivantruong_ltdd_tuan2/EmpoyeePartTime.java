package com.example.a19512861_maivantruong_ltdd_tuan2;

public class EmpoyeePartTime extends Employee {
    @Override
    public double TinhLuong() {
        return 150;
    }

    @Override
    public String toString() {
        return super.toString() + " --> Part time = " + TinhLuong();
    }
}
