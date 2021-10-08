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
public class Kotak {
    int sisi;
    
    int hitungLuas() {
        Persegi p = new Persegi();
        return p.hitungLuas(this.sisi);
    }
}
