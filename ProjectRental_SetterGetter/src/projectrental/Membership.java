/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrental;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Membership {
    public DataMember member;
    private int tglPeminjaman;
    private int blnPeminjaman;
    private int thnPeminjaman;
    private int tglPengembalian;
    private int blnPengembalian;
    private int thnPengembalian;
    private LocalDate waktuPeminjaman;
    private LocalDate waktuPengembalian;
    private int lama;

    ArrayList<DataMember> dataMember = new ArrayList<>();
    
    public void tambahMember() {
        dataMember.add(new DataMember("M001", "Mr. X", "Silver"));
        dataMember.add(new DataMember("M002", "Mr. Y", "Gold"));
        dataMember.add(new DataMember("M003", "Mr. Z", "Platinum"));
    }
    
    private void cariMember(String Id) {
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
    
    private void setTanggalPinjam(int tgl) {
        if (tgl > 0 && tgl <= 31) {
        tglPeminjaman = tgl;
        } else {
            System.out.println("Tanggal tidak sesuai");
            System.exit(0);
        }
    }
    
    private void setBulanPinjam(int bln) {
        if (bln > 0 && bln < 13) {
            blnPeminjaman = bln;
        } else {
            System.out.println("Bulan tidak sesuai");
            System.exit(0);
        }
    }
    
    private void setTahunPinjam(int thn) {
        if (thn >= 1970 && thn <= 2100) {
            thnPeminjaman = thn;
        } else {
            System.out.println("Tahun tidak sesuai");
            System.exit(0);
        }
    }
    
    private void setTanggalKembali(int tgl) {
        if (tgl > 0 && tgl <= 31) {
        tglPengembalian = tgl;
        } else {
            System.out.println("Tanggal tidak sesuai");
            System.exit(0);
        }
    }
    
    private void setBulanKembali(int bln) {
        if (bln > 0 && bln < 13) {
            blnPengembalian = bln;
        } else {
            System.out.println("Bulan tidak sesuai");
            System.exit(0);
        }
    }
    
    private void setTahunKembali(int thn) {
        if (thn >= 1970 && thn <= 2100) {
            thnPengembalian = thn;
        } else {
            System.out.println("Tahun tidak sesuai");
            System.exit(0);
        }
    }
    
    protected void hitungPeminjaman() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Peminjaman : ");
        setTanggalPinjam(input.nextInt());
        System.out.print("Masukkan Bulan Peminjaman : ");
        setBulanPinjam(input.nextInt());
        System.out.print("Masukkan Tahun Peminjaman : ");
        setTahunPinjam(input.nextInt());
        waktuPeminjaman = LocalDate.of(thnPeminjaman, blnPeminjaman, tglPeminjaman);
        
        System.out.print("Masukkan Tanggal Pengembalian : ");
        setTanggalKembali(input.nextInt());
        System.out.print("Masukkan Bulan Pengembalian : ");
        setBulanKembali(input.nextInt());
        System.out.print("Masukkan Tahun Pengembalian : ");
        setTahunKembali(input.nextInt());
        System.out.println("");
        waktuPengembalian = LocalDate.of(thnPengembalian, blnPengembalian, tglPengembalian);
        
        long days = ChronoUnit.DAYS.between(waktuPeminjaman, waktuPengembalian);
        lama = Math.toIntExact(days);
        if(lama < 0) {
            System.out.println("Tanggal Pengembalian Tidak Sesuai");
            System.exit(0);
        }
    }  
    
    public int getLama() {
        return lama;
    }
    
    protected void pinjamKembali() {
        member.printMember();
        System.out.println("Tanggal Peminjaman : " + waktuPeminjaman);
        System.out.println("Tanggal Pengembalian : " + waktuPengembalian);
        System.out.println("Lama Peminjaman : " + lama + " hari");
        System.out.println("");
    }
    
}
