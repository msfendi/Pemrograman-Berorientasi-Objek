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
    protected int diskon = 1;
    protected int poin = 1;
    int totalPoin;
    int totalSewa;
    
    Silver(DataMember member) {
        super.member = member;
        super.hargaSewa = 25000;
    }
    
    protected void hitungLayanan() {
        hitungPeminjaman();
        totalSewa = hargaSewa * lama;
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
        totalPoin = poin * lama;
    }
    
    protected void printSilver() {
        this.pinjamKembali();
        System.out.println("Total Biaya Rental : Rp. " + totalSewa);
        System.out.println("Jumlah Poin : " + totalPoin);
    }
}
