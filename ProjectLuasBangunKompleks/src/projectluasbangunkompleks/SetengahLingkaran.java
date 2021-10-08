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
public class SetengahLingkaran {
    int diameter;
    
    double hitungLuas() {
        Lingkaran l = new Lingkaran();
        int jari_jari = diameter / 2;
        return l.hitungLuas(jari_jari) / 2;
    }
}
