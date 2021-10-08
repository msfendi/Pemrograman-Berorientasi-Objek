/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author User
 */
public class Lingkaran {
    static double lingkaran(int r) {
        double hasil = (double)22/7 * r * r;
        return hasil;
    }
    
    //    method
    double hitungLuas(int jari_jari) {
        double luas = lingkaran(jari_jari);
        return luas;
    }
}
