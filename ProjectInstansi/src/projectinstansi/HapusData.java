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
public class HapusData {
    void hapusData(ArrayList<DataKaryawan> data) {
        Scanner input = new Scanner(System.in);
            System.out.print("Kode Karyawan yang mau dihapus : ");
            String inputan = input.nextLine();
            boolean ketemu = false;
            int index = 0;
            for(int i = 0; i < data.size(); i++) {
                if(data.get(i).kode.equals(inputan)){
                    ketemu = true;
                    index = i;
                    }
            }   
            if(ketemu == true) {
                data.remove(index);
                System.out.println("Karyawan dengan kode " + inputan + " sudah dihapus dari dalam data");
                System.out.println("");
            } else {
                System.out.println("Kode Karyawan " + inputan + " tidak ada dalam data");
                System.out.println("");
            }
    }
}
