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
    protected int diskon = 3;
    protected int poin = 10;
    int totalPoin;
    int totalSewa;
    protected int cashback = 10000;
    protected int bnsPulsa = 5000;
    int totalPulsa;
    
    Platinum(DataMember member) {
        super.member = member;
        super.hargaSewa = 45000;
    }
    
    void hitungLayanan() {
        hitungPeminjaman();
        totalSewa = hargaSewa * lama;
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
        totalPoin = poin * lama;
        totalPulsa = bnsPulsa * lama;
    }
    
    
    void printPlatinum() {
        this.pinjamKembali();
        System.out.println("Total Biaya Rental : Rp." + totalSewa);
        System.out.println("Jumlah Poin : " + totalPoin);
        System.out.println("Cashback : Rp. " + cashback);
        System.out.println("Bonus Pulsa : Rp. " + totalPulsa);
    }
}
