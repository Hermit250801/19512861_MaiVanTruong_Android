package com.example.a19512861_maivantruong_ltdd_tuan2;

public class EmployeePFullTime extends Employee {
    @Override
    public double TinhLuong() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString() + " --> Full time = " + TinhLuong();
    }
}
