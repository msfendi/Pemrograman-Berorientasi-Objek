/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArrayProcessing {
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
    
    double cariMax(int[] data) {
        double max = data[0];
        for (int i=0; i<this.n; i++) {
            if(data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
    
    double cariMin(int[] data) {
        double min = data[0];
        for (int i=0; i<this.n; i++) {
            if(data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
    
    void output() {
        System.out.println("Nilai Maksimalnya: " + this.cariMax(this.dataBil));
        System.out.println("Nilai Minimalnya: " + this.cariMin(this.dataBil));
    }
}
