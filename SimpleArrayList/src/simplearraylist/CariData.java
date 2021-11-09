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
public class CariData {
    void cariData(ArrayList<String> data) {
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
                System.out.println("String " + inputan + " ada di index ke " + data.indexOf(inputan) + " di dalam data");
                System.out.println("");
            } else {
                System.out.println("String " + inputan + " tidak ada dalam data");
                System.out.println("");
            }

    }
}