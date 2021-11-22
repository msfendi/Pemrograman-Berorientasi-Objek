/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrental;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Membership {
    public DataMember member;
    LocalDate waktuPeminjaman;
    LocalDate waktuPengembalian;
    int lama;
    int hargaSewa;
    ArrayList<DataMember> dataMember = new ArrayList<DataMember>();
    
    public void tambahMember(DataMember data) {
        dataMember.add(data);
    }
    
    void cariMember(String Id) {
        boolean ketemu = false;
        int ke = -1;
            for(int i = 0; i < dataMember.size(); i++) {
                if(dataMember.get(i).Id.equals(Id)){
                    ketemu = true;
                    ke = i;
                    }
            }   
            if(ketemu == true) {
                member = dataMember.get(ke);
            } else {
                System.out.println("Member tidak terdaftar");
                System.exit(0);
            }
    }
    
    public DataMember inputMember() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member Anda : ");
        cariMember(input.nextLine());
        return member;
    }
    
    void hitungPeminjaman() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Peminjaman : ");
        int tglPeminjaman = input.nextInt();
        System.out.print("Masukkan Bulan Peminjaman : ");
        int blnPeminjaman = input.nextInt();
        System.out.print("Masukkan Tahun Peminjaman : ");
        int thnPeminjaman = input.nextInt();
        waktuPeminjaman = LocalDate.of(thnPeminjaman, blnPeminjaman, tglPeminjaman);
        
        System.out.print("Masukkan Tanggal Pengembalian : ");
        int tglPengembalian = input.nextInt();
        System.out.print("Masukkan Bulan Pengembalian : ");
        int blnPengembalian = input.nextInt();
        System.out.print("Masukkan Tahun Pengembalian : ");
        int thnPengembalian = input.nextInt();
        waktuPengembalian = LocalDate.of(thnPengembalian, blnPengembalian, tglPengembalian);
        
        lama = Period.between(waktuPeminjaman, waktuPengembalian).getDays();
    }
    
    void pinjamKembali() {
        member.printMember();
        System.out.println("Tanggal Peminjaman : " + waktuPeminjaman);
        System.out.println("Tanggal Pengembalian : " + waktuPengembalian);
        System.out.println("Lama Peminjaman : " + lama + " hari");
    }
    
}
