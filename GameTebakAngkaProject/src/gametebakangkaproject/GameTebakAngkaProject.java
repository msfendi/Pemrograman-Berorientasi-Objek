/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author User
 */
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
       int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
       Scanner masukkan = new Scanner(System.in);
       
       while (true) {
            System.out.print("Masukkan Tebakan Anda: ");
            int tebakan = masukkan.nextInt();

            if (tebakan > randomNum) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
            } else if (tebakan < randomNum) {
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            } else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                break;
            }   
       }

    }
    
}
