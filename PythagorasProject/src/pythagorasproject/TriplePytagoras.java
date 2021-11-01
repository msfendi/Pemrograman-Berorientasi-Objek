/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class TriplePytagoras {
    Scanner masukkan = new Scanner(System.in);
    
    String hitungPytagoras() {
        System.out.print("Masukkan nilai a :");
        int a = masukkan.nextInt();
        System.out.print("Masukkan nilai b :");
        int b = masukkan.nextInt();
        System.out.print("Masukkan nilai c :");
        int c = masukkan.nextInt();
        
        int cKuadrat = a^2 + b^2;
        if (cKuadrat == (c^2)) {
            return ("triple pytagoras");
        } else {
            return ("bukan triple pytagoras");
        }
    }
        
}
