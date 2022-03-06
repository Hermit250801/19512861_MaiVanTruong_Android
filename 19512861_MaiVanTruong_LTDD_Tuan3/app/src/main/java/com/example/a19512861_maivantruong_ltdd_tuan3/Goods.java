package com.example.a19512861_maivantruong_ltdd_tuan3;

public class Goods {
    private String id;
    private String name;

    public Goods() {
        super();
    }

    public Goods(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.name;
    }
}
