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
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menu Aplikasi1");
        
        System.out.println("1. Cek triple pythagoras\n" +
            "2. Menentukan sisi miring segitiga\n" +
            "3. Menentukan sisi siku-siku segitiga\n" +
            "4. Exit");
        System.out.println("");
        Scanner masukkan = new Scanner(System.in);

        System.out.print("Pilih menu yang ingin digunakan (1-4) :"); 

        switch(masukkan.nextInt()) {
        case 1:
            TriplePytagoras tp = new TriplePytagoras();
            System.out.println("Ketiga bilangan yang anda masukkan tersebut merupakan " + tp.hitungPytagoras());
            break;
        case 2:
            SisiMiring sm = new SisiMiring();
            System.out.println("Nilai dari sisi miring C adalah = " + sm.hitungSisiMiring());
            break;
        case 3:
            SisiSiku sk = new SisiSiku();
            System.out.println("Nilai dari sisi siku B adalah = " + sk.hitungSisiSiku());
            break;
        case 4:
//            System.exit(0);
            break;
        default:
            System.out.print("Pilih menu yang ingin digunakan (1-4) :");
            break;
        }

    }
    
}
