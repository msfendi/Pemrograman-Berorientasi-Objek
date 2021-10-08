/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author User
 */
public class ProjectLuasBangunKompleks1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Project 1

//      Menghitung masing - masing ukuran lingkaran
        SetengahLingkaran A = new SetengahLingkaran();
        A.diameter = 42;
        
        SetengahLingkaran B = new SetengahLingkaran();
        B.diameter = 42;
        
        SetengahLingkaran C = new SetengahLingkaran();
        C.diameter = 42;
        
        SetengahLingkaran D = new SetengahLingkaran();
        D.diameter = 42;
        
//        Menghitung total gabungan luas Setengah Lingkaran
        double totalLuasLingkaran = A.hitungLuas() + B.hitungLuas() + C.hitungLuas() + D.hitungLuas();
        
     // Menghitung masing - masing ukuran lingkaran
        Kotak K = new Kotak();
        K.sisi = 42;
        
//         Menghitung luas persegi
        int totalLuasPersegi = K.hitungLuas();
        
        double luasBangunKompleks = totalLuasLingkaran + totalLuasPersegi;
        System.out.println("Project 1");
        System.out.println("Luas Bangun Datar Kompleks adalah: " + luasBangunKompleks);
    }
      
}
