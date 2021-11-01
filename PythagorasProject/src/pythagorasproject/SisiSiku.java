/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SisiSiku {
    Scanner masukkan = new Scanner(System.in);
    
    double hitungSisiSiku () {
        System.out.print("Masukkan nilai a :");
        int a = masukkan.nextInt();
        System.out.print("Masukkan nilai c :");
        int c = masukkan.nextInt();
        
        double bkuadrat = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
        return bkuadrat;
    }
}
