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
    private final int diskon = 2;
    private int poin = 5;
    private int totalSewa;
    private final int cashback = 5000;
    private final int hargaSewa = 30000;
    
    Gold(DataMember member) {
        super.member = member;
//        super.hargaSewa = 30000;
    }
    
    protected void hitungLayanan() {
        hitungPeminjaman();
        poin = poin * getLama();
        totalSewa = hargaSewa * getLama();
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
    }
    
    protected void printGold() {
        this.pinjamKembali();
        System.out.println("Total Biaya Rental : Rp. " + totalSewa);
        System.out.println("Jumlah Poin : " + poin);
        System.out.println("Cashback : Rp. " + cashback);
    }
}
