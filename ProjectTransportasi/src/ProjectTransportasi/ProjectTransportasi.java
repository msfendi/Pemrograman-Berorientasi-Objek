/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectTransportasi;

import Kendaraan.MPV;
import Kendaraan.SUV;
import Kendaraan.Sedan;

/**
 *
 * @author User
 */
public class ProjectTransportasi {
    public static void main(String[] args) {
        // Mobil A
        System.out.println("A ~ Sedan ~ Solo-Kudus(160 km) ~ 60km/jam");
        Sedan A = new Sedan();
        A.jarak = 160;
        A.kecepatan = 60;
        A.tampilHasil();
        System.out.println("");
        
        // Mobil B
        System.out.println("B ~ Sedan ~ Solo-Jakarta(538 km) ~ 65km/jam");
        Sedan B = new Sedan();
        B.jarak = 538;
        B.kecepatan = 65;
        B.tampilHasil();
        System.out.println("");
        
        // Mobil C
        System.out.println("C ~ SUV ~ Solo-Banten(663 km) ~ 57km/jam");
        SUV C = new SUV();
        C.jarak = 663;
        C.kecepatan = 57;
        C.tampilHasil();
        System.out.println("");
        
        // Mobil D
        System.out.println("D ~ SUV ~ Solo-Bandung(535 km) ~ 62km/jam");
        SUV D = new SUV();
        D.jarak = 535;
        D.kecepatan = 62;
        D.tampilHasil();
        System.out.println("");
        
        // Mobil E
        System.out.println("E ~ MPV ~ Solo-Banyuwangi(541 km) ~ 64km/jam");
        MPV E = new MPV();
        E.jarak = 541;
        E.kecepatan = 64;
        E.tampilHasil();
        System.out.println("");
        
        // Mobil F
        System.out.println("F ~ MPV ~ Solo-Jember(433 km) ~ 53km/jam");
        MPV F = new MPV();
        F.jarak = 433;
        F.kecepatan = 53;
        F.tampilHasil();
        System.out.println("");
    }
}
