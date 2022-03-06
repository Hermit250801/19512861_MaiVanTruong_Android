package com.example.a19512861_maivantruong_ltdd_tuan3;

public class Product extends Goods {
    private Catalog Dmuc;

    public Catalog getDmuc() {
        return Dmuc;
    }

    public Product(String id, String name, Catalog dmuc) {
        super(id, name);
        Dmuc = dmuc;
    }

    public Product(String id, String name) {
        super(id, name);
    }

    public void setDmuc(Catalog dmuc) {
        Dmuc = dmuc;
    }

    public Product() {
        super();
    }
}
