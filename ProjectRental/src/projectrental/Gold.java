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
    protected int diskon = 2;
    protected int poin = 5;
    int totalPoin;
    int totalSewa;
    protected int cashback = 5000;
    
    Gold(DataMember member) {
        super.member = member;
        super.hargaSewa = 30000;
    }
    
    protected void hitungLayanan() {
        hitungPeminjaman();
        totalPoin = poin * lama;
        totalSewa = hargaSewa * lama;
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
    }
    
    protected void printGold() {
        this.pinjamKembali();
        System.out.println("Total Biaya Rental : Rp. " + totalSewa);
        System.out.println("Jumlah Poin : " + totalPoin);
        System.out.println("Cashback : Rp. " + cashback);
    }
}
