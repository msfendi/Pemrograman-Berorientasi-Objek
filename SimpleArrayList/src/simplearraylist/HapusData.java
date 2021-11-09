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
public class HapusData {
    void hapusData(ArrayList<String> data) {
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan data string : ");
            String inputan = input.nextLine();
            boolean ketemu = false;
            for(int i = 0; i < data.size(); i++) {
                if(data.get(i).equals(inputan)){
                    ketemu = true;
                    }
            }   
            if(ketemu == true) {
                data.remove(inputan);
                System.out.println("String " + inputan + " sudah dihapus dari dalam data");
                System.out.println("");
            } else {
                System.out.println("String " + inputan + " tidak ada dalam data");
                System.out.println("Daftar string dalam array list : " + data);
                System.out.println("");
            }
    }
}
