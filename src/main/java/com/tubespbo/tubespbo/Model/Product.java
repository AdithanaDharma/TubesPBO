package com.tubespbo.tubespbo.Model;

public class Product {
    private int productId;
    private String namaProduk;
    private int stokBarang;

    //ini constructor
    public Product() {
    }

    public Product(int productId) {
        this.productId = productId;
    }

    public Product(int productId, String namaProduk) {
        this(productId);
        this.namaProduk = namaProduk;
    }

    public Product(int productId, String namaProduk, int stokBarang) {
        this(productId, namaProduk);
        this.stokBarang = stokBarang;
    }

    //ini getter setter
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }
}

