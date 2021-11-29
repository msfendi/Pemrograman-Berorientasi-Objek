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
    private final int diskon = 1;
    private int poin = 1;
    private final int hargaSewa = 25000;
    private int totalSewa;
    
    Silver(DataMember member) {
        super.member = member;
    }
    
    protected void hitungLayanan() {
        hitungPeminjaman();
        totalSewa = hargaSewa * getLama();
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
        poin = poin * getLama();
    }
    
    protected void printSilver() {
        this.pinjamKembali();
        System.out.println("Total Biaya Rental : Rp. " + totalSewa);
        System.out.println("Jumlah Poin : " + poin);
    }
}
