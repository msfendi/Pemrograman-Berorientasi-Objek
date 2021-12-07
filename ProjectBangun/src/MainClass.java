
import bangundatar.BangunDatar;
import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MainClass {
    public static void main(String[] args) {
        
//        Bangun Datar
        System.out.println("Persegi");
        Persegi p1 = new Persegi();
        p1.sisi = 2;
        p1.tampilHasil();
        System.out.println("");
        
        System.out.println("Lingkaran");
        Lingkaran l1 = new Lingkaran();
        l1.jari_jari = 15;
        l1.tampilHasil();
        System.out.println("");
        
        System.out.println("Persegi Panjang");
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 5;
        pp1.lebar = 3;
        pp1.tampilHasil();
        System.out.println("");
        
//        Bangun Ruang
        System.out.println("Balok");
        Balok b1 = new Balok();
        b1.panjang = 5;
        b1.lebar = 3;
        b1.tinggi = 4;
        b1.tampilHasil();
        System.out.println("");
        
        System.out.println("Tabung");
        Tabung t1 = new Tabung();
        t1.jari_jari = 7;
        t1.tinggi = 10;
        t1.tampilHasil();
        System.out.println("");
        
        System.out.println("Bola");
        Bola bl1 = new Bola();
        bl1.jari_jari = 15;
        bl1.tampilHasil();
        System.out.println("");
    }
}
