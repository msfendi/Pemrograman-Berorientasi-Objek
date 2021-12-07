/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author User
 */
public class Bola extends BangunRuang{
    public double jari_jari;

    @Override
    public double hitungVolume(){
        double volume = 4/3 * (double)22/7 * this.jari_jari * this.jari_jari * this.jari_jari;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luasPermukaan = 4 * (double)22/7 * this.jari_jari * this.jari_jari;
        return luasPermukaan;
    }
}
