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
public class Platinum extends Membership{
    int diskon = 3;
    int poin;
    int totalSewa;
    int cashback = 10000;
    int bnsPulsa = 5000;
    
    Platinum(DataMember member) {
        super.member = member;
        super.hargaSewa = 45000;
    }
    
    void hitungLayanan() {
        hitungPeminjaman();
        poin = 10 * lama;
        totalSewa = hargaSewa * lama;
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
    }
    
    void printPlatinum() {
        super.pinjamKembali();
        System.out.println("Total Biaya Rental : " + totalSewa);
        System.out.println("Jumlah Poin : " + poin);
        System.out.println("Cashback : Rp. " + cashback);
        System.out.println("Bonus Pulsa : Rp. " + bnsPulsa);
    }
}
