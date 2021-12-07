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
public class Tabung extends BangunRuang{
    public double jari_jari;
    public double tinggi;

    @Override
    public double hitungVolume(){
        double volume = Math.PI * this.jari_jari * this.jari_jari * this.tinggi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luasPermukaan = 2 * Math.PI * this.jari_jari * (this.jari_jari + this.tinggi);
        return luasPermukaan;
    }
}
