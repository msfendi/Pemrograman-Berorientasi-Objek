/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Rerata {
    int[] dataBil = new int[100];
    int n;
    ArrayList<Integer> dataBil2 = new ArrayList<Integer>();
    
//    void input() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan banyaknya data (n) : ");
//        this.n = input.nextInt();
//        for(int i=0; i<n; i++){
//            System.out.println("Masukkan bil ke-"+(i+1+": "));
//            this.dataBil[i] = input.nextInt();
//        }
//    }
    
//    double hitungRerata(int[] data) {
//        double sum = 0;
//        for (int i=0; i<this.n; i++) {
//            sum += data[i];
//        }
//        double rerata = sum/this.n;
//        return rerata;
//    }
    
//    void output() {
//        System.out.println("Reratannya: " + this.hitungRerata(this.dataBil));
//    }
    
    
    void input() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Masukkan bil bulat : ");
            dataBil2.add(input.nextInt());
            System.out.println("Isi data list : " + this.dataBil2);
            input.nextLine();
            System.out.println("Input lagi (y/n) : ");
            char ans = input.nextLine().charAt(0);
            if(ans == 'n') {
                break;
            }
        }
    }
    
    double hitungRerata(ArrayList<Integer> data) {
        double sum = 0;
        for(Integer item: data) {
            sum += item;
        }
        double rerata = sum/data.size();
        return rerata;
    }
    
    void output() {
        System.out.println("--------------------");
        System.out.println("Rerata data : " + this.hitungRerata(this.dataBil2));
        System.out.println("Banyak data : " + this.dataBil2.size());
        System.out.println("Data maks : " + Collections.max(this.dataBil2));
        System.out.println("Data min : " + Collections.min(this.dataBil2));
    }
}
