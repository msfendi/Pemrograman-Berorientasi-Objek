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
public class Bola {
    public static final double pi = 3.14;
    public int r;
    
    public void hitungVol() {
        double volume = 1.3 * pi * r * r * r;
        System.out.println("Volume Bolanya: " + volume);
    }
    
    public void hitungLuasSelimut() {
        double luasSelimut = 4 * pi * r * r;
        System.out.println("Luas Selimut Bolanya: " + luasSelimut);
    }
}
