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
public class Lingkaran extends BangunDatar{
    public double jari_jari;

    @Override
    public double hitungLuas(){
        double luas = (double)22/7 * this.jari_jari * this.jari_jari;
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
        double keliling = (double)22/7 * this.jari_jari * 2;
        return keliling;
    }
}
