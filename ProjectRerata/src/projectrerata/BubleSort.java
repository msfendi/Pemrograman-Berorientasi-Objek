/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BubleSort {
    
    int[] dataBil = new int[100];
    int n;
    
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya data (n) : ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Masukkan bil ke-"+(i+1+": "));
            this.dataBil[i] = input.nextInt();
        }
    }
    
    String urutkan(int[] data) {
        for (int a=0;a<this.n;a++){
//            System.out.println("Literasi ke-"+(a+1));
            for(int b=0;b<this.n-1;b++) {
                if (data[b]>data[b+1]) {

                int temp =data[b];
                data[b]=data[b+1];
                data[b+1]=temp;
                }
//                System.out.println(Arrays.toString(data));
            }
//            System.out.println("Hasil akhir setelah disorting: "+Arrays.toString(bilangan));
        }
        return Arrays.toString(data);
    }
    
    void output() {
        System.out.println("Hasil urutan bublesort: " + this.urutkan(this.dataBil));
    }
}


