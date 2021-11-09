/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class SimpleArrayList {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> dataString = new ArrayList<String>();
        
        while(true) {
            System.out.println("Menu Data ArrayList");
            System.out.println("1. Tambah Data\n" +
                "2. Cari Data\n" +
                "3. Hapus Data\n" +
                "4. Tampil Data\n" +
                "5. Keluar");
            Scanner masukkan = new Scanner(System.in);

            System.out.print("Pilih nomor berapa :"); 

            switch(masukkan.nextInt()) {
            case 1:
                TambahData td = new TambahData();
                td.tambahData(dataString);
                break;
            case 2:
                CariData cd = new CariData();
                cd.cariData(dataString);
                break;
            case 3:
                HapusData hd = new HapusData();
                hd.hapusData(dataString);
                break;
            case 4:
                TampilData tmpld = new TampilData();
                tmpld.tampilData(dataString);
                break;
            case 5:
                System.out.println("Program telah berhenti");
                System.exit(0);
                break;
            default:
                System.out.print("Pilih menu yang ingin digunakan (1-4) :");
                break;
            }
        }
        

    }
    
}
