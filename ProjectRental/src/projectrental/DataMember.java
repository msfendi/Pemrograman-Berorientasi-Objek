/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrental;

/**
 *
 * @author User
 */
public class DataMember {
    String Id;
    String Nama;
    String Jenis;
    
    DataMember(String id, String nama, String jenis) {
        this.Id = id;
        this.Nama = nama;
        this.Jenis = jenis;
    }
    
    void printMember() {
        System.out.println("ID Member : " + this.Id);
        System.out.println("Nama Member : " + this.Nama);
        System.out.println("Jenis Member : " + this.Jenis);
        System.out.println("");
    }
}
