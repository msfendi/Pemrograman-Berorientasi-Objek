/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author User
 */
public class Lingkaran {
    
    public static final double pi = 3.14;
    public int r;
    
    public void hitungLuas() {
        double luas = pi * r * r;
        System.out.println("Luas Lingkarannya: " + luas);
    }
    
    public void hitungKeliling() {
        double keliling = 2 * pi * r;
        System.out.println("Keliling Lingkarannya: " + keliling);
    }
}
