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
public class TambahData {
    void tambahData(ArrayList<String> data) {
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan data string : ");
            data.add(input.nextLine());
            System.out.println("Daftar string dalam array list : " + data);
            System.out.println("");
    }
}
