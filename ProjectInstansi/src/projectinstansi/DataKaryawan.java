/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectinstansi;

/**
 *
 * @author User
 */
public class DataKaryawan {
    public String kode;
    public String nama;
    public String alamat;
    public String tgllahir;
    public int usia;
    public String gol;
    public int status;
    public int jmlanak;
    
    DataKaryawan(String kode, String nama, String alamat, String tgllahir, int usia, String gol, int status, int jmlanak) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.tgllahir = tgllahir;
        this.usia = usia;
        this.gol = gol;
        this.status = status;
        this.jmlanak = jmlanak;
    }
    
    protected void printKaryawan() {
        System.out.println("===================================");
        System.out.println("DATA PROFILE KARYAWAN");
        System.out.println("------------------------------------");
        System.out.println("Kode Karyawan : " + this.kode);
        System.out.println("Nama Karyawan : " + this.nama);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Tanggal Lahir : " + this.tgllahir);
        System.out.println("Usia : " + this.usia);
        System.out.println("Golongan : " + this.gol);
        String hubungan = (this.status == 0) ? "Belum Menikah" : "Menikah";
        System.out.println("Status Menikah : " + hubungan);
        System.out.println("Jumlah Anak : " + this.jmlanak);
        System.out.println("");
    }
}
