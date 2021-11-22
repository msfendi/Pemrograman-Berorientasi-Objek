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
public class Gold extends Membership{
    int diskon = 2;
    int poin;
    int totalSewa;
    int cashback = 5000;
    
    Gold(DataMember member) {
        super.member = member;
        super.hargaSewa = 30000;
    }
    
    void hitungLayanan() {
        hitungPeminjaman();
        poin = 5 * lama;
        totalSewa = hargaSewa * lama;
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
    }
    
    void printGold() {
        super.pinjamKembali();
        System.out.println("Total Biaya Rental : " + totalSewa);
        System.out.println("Jumlah Poin : " + poin);
        System.out.println("Cashback : Rp. " + cashback);
    }
}
