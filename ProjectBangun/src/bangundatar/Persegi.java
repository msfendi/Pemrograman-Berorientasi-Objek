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
public class Persegi extends BangunDatar{
    public double sisi;

    @Override
    public double hitungLuas(){
        double luas = this.sisi * this.sisi;
        return luas;
    }
    
    @Override
    public double hitungKeliling(){
        double keliling = 4 * this.sisi;
        return keliling;
    }

}
