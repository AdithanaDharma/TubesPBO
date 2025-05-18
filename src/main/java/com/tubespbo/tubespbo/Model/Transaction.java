package com.tubespbo.tubespbo.Model;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private int noPesanan;
    private String namaProduk;
    private int kuantitas;
    private BigDecimal total;
    private LocalDateTime waktuTransaksi;

    //ini constructor brow
    public Transaction() {
        this.waktuTransaksi = LocalDateTime.now();
    }

    public Transaction(int noPesanan) {
        this();
        this.noPesanan = noPesanan;
    }

    public Transaction(int noPesanan, String namaProduk) {
        this(noPesanan);
        this.namaProduk = namaProduk;
    }

    public Transaction(int noPesanan, String namaProduk, int kuantitas) {
        this(noPesanan, namaProduk);
        this.kuantitas = kuantitas;
    }

    // Constructor 5 - lengkap (termasuk total)
    public Transaction(int noPesanan, String namaProduk, int kuantitas, BigDecimal total) {
        this(noPesanan, namaProduk, kuantitas);
        this.total = total;
    }

    public Transaction(int noPesanan, String namaProduk, int kuantitas, BigDecimal total, LocalDateTime waktuTransaksi) {
        this(noPesanan, namaProduk, kuantitas, total);
        this.waktuTransaksi = waktuTransaksi;
    }

    //ini getter setter
    public LocalDateTime getWaktuTransaksi() {
        return waktuTransaksi;
    }

    public void setWaktuTransaksi(LocalDateTime waktuTransaksi) {
        this.waktuTransaksi = waktuTransaksi;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}