/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kendaraan;

/**
 *
 * @author User
 */
public abstract class Kendaraan {
    public abstract double jumlahBbMin();
    public abstract int lamaPerjalanan();
    
    public void tampilHasil() {
        int modWaktu = this.lamaPerjalanan() % 3600;
        int jam = (lamaPerjalanan() - modWaktu) / 3600;
        int menit = (modWaktu - modWaktu % 60) /60;
        System.out.println("Jumlah Bahan Bakar Minimal : " + this.jumlahBbMin() + " Liter");
        System.out.println("Lama Perjalanan : " + jam + " Jam " + menit + " menit");
    }
}
