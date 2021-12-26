/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectinstansi;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class LihatData {
    void tampilData(ArrayList<DataKaryawan> data) {
        System.out.println("============================================================================================");
        System.out.println("Data Karyawan");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Kode Kary       Nama Kary       Gol         Usia        Status Nikah        Jumlah Anak     ");
        System.out.println("--------------------------------------------------------------------------------------------");
        for(int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).kode + "             " + data.get(i).nama + "             " + data.get(i).gol + "               " + data.get(i).usia + "               " + data.get(i).status + "               " + data.get(i).jmlanak);
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Jumlah Data : " + data.size());
    }
    
}
