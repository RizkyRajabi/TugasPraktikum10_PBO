/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rizky
 */
public class Mahasiswa {
    private String nim, nama, alamat, matkul;
    private double nilaiAkhir;

    public Mahasiswa(String nim, String nama, String alamat, String matkul, double nilaiAkhir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.matkul = matkul;
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getMatkul() { return matkul; }
    public double getNilaiAkhir() { return nilaiAkhir; }
}

