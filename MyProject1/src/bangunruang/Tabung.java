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
public class Tabung {
    public static final double pi = 3.14;
    public int r;
    public int t;
    
    public void hitungVol() {
        double volume = pi * r * r * t;
        System.out.println("Volume Tabungnya: " + volume);
    }
    
    public void hitungLuasSelimut() {
        double luasSelimut = 2 * pi * r * t;
        System.out.println("Luas Selimut Tabungnya: " + luasSelimut);
    }
}
