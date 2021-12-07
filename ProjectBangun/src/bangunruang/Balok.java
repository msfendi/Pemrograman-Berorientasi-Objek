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
public class Balok extends BangunRuang{
    public double panjang;
    public double lebar;
    public double tinggi;

    @Override
    public double hitungVolume(){
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
    
    @Override
    public double hitungLuasPermukaan(){
        double luasPermukaan = 2 * ((this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.lebar * this.tinggi));
        return luasPermukaan;
    }
}
