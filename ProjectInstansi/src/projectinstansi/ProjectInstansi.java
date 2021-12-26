/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectinstansi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProjectInstansi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<DataKaryawan> dataKaryawan = new ArrayList<DataKaryawan>();
        
        while(true) {
            System.out.println("Menu Data ArrayList");
            System.out.println("1. Tambah Data\n" +
                "2. Cari Data\n" +
                "3. Hapus Data\n" +
                "4. Lihat Data\n" +
                "5. Keluar");
            Scanner masukkan = new Scanner(System.in);

            System.out.print("Pilih nomor berapa :"); 

            switch(masukkan.nextInt()) {
            case 1:
            OUTER:
            while (true) {
                TambahData td = new TambahData();
                td.tambahData(dataKaryawan);
                System.out.println("Pilih SubMenu : ");
                System.out.println("1. Kembali ke menu utama\n" +
                        "2. Tambah Data Kembali");
                System.out.print("Menu Pilihan :");
                switch (masukkan.nextInt()) {
                    case 1:
                        break OUTER;
                    case 2:
                        continue;
                    default:
                        System.out.println("Pilih menu yang tersedia (1/2) :");
                        break OUTER;
                }
            }
               break;
            case 2:
            OUTER:
            while (true) {
                CariData cd = new CariData();
                DataKaryawan data = cd.inputKaryawan(dataKaryawan);
                if(data != null) {
                    cd.tampilHasil(data);
                }
                System.out.println("Pilih SubMenu : ");
                System.out.println("1. Kembali ke menu utama");
                System.out.print("Menu Pilihan :");
                switch (masukkan.nextInt()) {
                    case 1:
                        break OUTER;
                    default:
                        System.out.println("Pilih menu yang tersedia (1) :");
                        break OUTER;
                }
            }
                break;
            case 3:
            OUTER:
            while (true) {
                HapusData hd = new HapusData();
                hd.hapusData(dataKaryawan);
                System.out.println("Pilih SubMenu : ");
                System.out.println("1. Kembali ke menu utama\n" +
                        "2. Hapus Data Kembali");
                System.out.print("Menu Pilihan :");
                switch (masukkan.nextInt()) {
                    case 1:
                        break OUTER;
                    case 2:
                        continue;
                    default:
                        System.out.println("Pilih menu yang tersedia (1/2) :");
                        break OUTER;
                }
            }
                break;
            case 4:
            OUTER:
            while (true) {
                LihatData tmpld = new LihatData();
                tmpld.tampilData(dataKaryawan);
                System.out.println("Pilih SubMenu : ");
                System.out.println("1. Kembali ke menu utama");
                System.out.print("Menu Pilihan :");
                switch (masukkan.nextInt()) {
                    case 1:
                        break OUTER;
                    default:
                        System.out.println("Pilih menu yang tersedia (1) :");
                        break OUTER;
                }
            }
                break;
            case 5:
                System.out.println("Program telah berhenti");
                System.exit(0);
                break;
            default:
                System.out.println("Pilih menu yang ingin digunakan (1-5) :");
                break;
            }
        }
    }
    
}
