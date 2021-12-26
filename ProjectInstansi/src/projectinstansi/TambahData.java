/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectinstansi;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TambahData {
    private String kodeKrywn;
    private String namaKrywn;
    private String alamat;
    private String tglLahir;
    private String golongan;
    private int status;
    private int jmlAnak;
    
    void tambahData(ArrayList<DataKaryawan> data) {
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Kode Karyawan : ");
            kodeKrywn = input.nextLine();
            
            System.out.print("Masukkan Nama Karyawan : ");
            namaKrywn = input.nextLine();
            
            System.out.print("Masukkan Alamat : ");
            alamat = input.nextLine();
            
            System.out.print("Masukkan Tanggal Lahir (yyyy-mm-dd) : ");
            tglLahir = input.nextLine();
            
            System.out.print("Masukkan Golongan (A/B/C) : ");
            golongan = input.nextLine();
            
            System.out.print("Masukkan Status Menikah (0/1) : ");
            status = input.nextInt();
            
            if(status == 1) {
            System.out.print("Masukkan Jumlah Anak : ");
            jmlAnak = input.nextInt();
            }
            
            data.add(new DataKaryawan(kodeKrywn, namaKrywn, alamat, tglLahir, hitungUsia(tglLahir), golongan, status, jmlAnak));
    }
    
        private int hitungUsia(String tglLahir) {
        LocalDate dateLahir = LocalDate.parse(tglLahir);
        return Period.between(dateLahir, LocalDate.now()).getYears();
    }
}
