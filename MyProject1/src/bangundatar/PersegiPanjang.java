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
public class PersegiPanjang {
//    atribute
    public int panjang;
    public int lebar;
    
//    method
    public void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjangnya: " + luas);
    }
    
    public void hitungKeliling() {
        int keliling = (2 * panjang) + (2 * lebar);
        System.out.println("Keliling Persegi Panjangnya: " + keliling);
    }
}
