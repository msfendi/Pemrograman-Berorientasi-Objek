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
public class SisiMiring {
    Scanner masukkan = new Scanner(System.in);
    
    double hitungSisiMiring () {
        System.out.print("Masukkan nilai a :");
        int a = masukkan.nextInt();
        System.out.print("Masukkan nilai b :");
        int b = masukkan.nextInt();
        
        double ckuadrat = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return ckuadrat;
    }
}
