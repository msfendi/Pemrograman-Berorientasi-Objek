/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author User
 */
public class MyNewClass {
    public static void main(String[] args) {
        OperasiBilangan op1 = new OperasiBilangan();
//        op1.bilPertama = 50;
//        op1.bilKedua = 60;
        op1.bilPertama = 100;
        op1.bilKedua = 150;
        op1.hitungPenjumlahan();
        op1.hitungPengurangan();
        op1.hitungPerkalian();
        op1.hitungPembagian();
    }
}
