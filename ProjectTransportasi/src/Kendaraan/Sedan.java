/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kendaraan;

/**
 *
 * @author User
 */
public class Sedan extends Kendaraan{
    public double jarak, kecepatan;

    @Override
    public double jumlahBbMin(){
        double bahanBakar = this.jarak / 10;
        return bahanBakar;
    }
    
    @Override
    public int lamaPerjalanan(){
        double jarak = this.jarak * 1000;
        double kecepatan = this.kecepatan * 1000;
        int waktu = (int)(jarak / (kecepatan / 3600));
        return waktu;
    }
}
