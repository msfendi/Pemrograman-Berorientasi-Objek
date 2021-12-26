/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectinstansi;

import java.util.ArrayList;
import java.util.Scanner;
import penggajian.GolonganA;
import penggajian.GolonganB;
import penggajian.GolonganC;

/**
 *
 * @author User
 */
public class CariData {
    private DataKaryawan karyawan;
    private void cariKaryawan(String inputKode, ArrayList<DataKaryawan> dataKaryawan) {
        boolean ketemu = false;
        int ke = -1;
            for(int i = 0; i < dataKaryawan.size(); i++) {
                if(dataKaryawan.get(i).kode.equals(inputKode)){
                    ketemu = true;
                    ke = i;
                    }
            }   
            if(ketemu == true) {
                karyawan = dataKaryawan.get(ke);
            } else {
                System.out.println("Data Karyawan Tidak Ditemukan");
            }
    }
    
    public DataKaryawan inputKaryawan(ArrayList<DataKaryawan> data) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Karyawan : ");
        cariKaryawan(input.nextLine(), data);
        return karyawan;
    }
    
    public void tampilHasil(DataKaryawan data) {
        data.printKaryawan();
        switch (data.gol) {
            case "A":
                GolonganA golA = new GolonganA();
                golA.dataKar = data;
                golA.hitungGaji();
                break;
            case "B":
                GolonganB golB = new GolonganB();
                golB.dataKar = data;
                golB.hitungGaji();
                break;
            case "C":
                GolonganC golC = new GolonganC();
                golC.dataKar = data;
                golC.hitungGaji();
                break;
            default:
                System.out.println("Pilih menu yang tersedia (1/2) :");
        }
    }
}
