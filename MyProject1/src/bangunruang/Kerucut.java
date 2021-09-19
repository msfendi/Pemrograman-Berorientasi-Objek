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
public class Kerucut {
    public static final double pi = 3.14;
    public int r;
    public int t;
    public int s;
    
    public void hitungVol() {
        double volume = 0.3 * pi * r * r * t;
        System.out.println("Volume Kerucutnya: " + volume);
    }
    
    public void hitungLuasSelimut() {
        double luasSelimut = pi * r * s;
        System.out.println("Luas Selimut Kerucutnya: " + luasSelimut);
    }
}
