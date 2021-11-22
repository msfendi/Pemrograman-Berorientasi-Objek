/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrental;

/**
 *
 * @author User
 */
public class Silver extends Membership {
    int diskon = 1;
    int poin;
    int totalSewa;
    
    Silver(DataMember member) {
        super.member = member;
        super.hargaSewa = 25000;
    }
    
    void hitungLayanan() {
        hitungPeminjaman();
        poin = 1 * lama;
        totalSewa = hargaSewa * lama;
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
    }
    
    void printSilver() {
        super.pinjamKembali();
        System.out.println("Total Biaya Rental : " + totalSewa);
        System.out.println("Jumlah Poin : " + poin);
    }
}
