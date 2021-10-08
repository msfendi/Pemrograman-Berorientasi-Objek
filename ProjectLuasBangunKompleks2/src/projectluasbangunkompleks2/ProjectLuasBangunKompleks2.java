/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks2;

/**
 *
 * @author User
 */
public class ProjectLuasBangunKompleks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //    Project 2
      SetengahLingkaran Abu = new SetengahLingkaran();
      Abu.diameter = 28;
      
      SetengahLingkaran Biru1 = new SetengahLingkaran();
      Biru1.diameter = 14;
      
      SetengahLingkaran Biru2 = new SetengahLingkaran();
      Biru2.diameter = 14;
      
      double luasDaerahAbuAbu = Abu.hitungLuas() - Biru1.hitungLuas() - Biru2.hitungLuas();
      
      System.out.println("Project 2");
      System.out.println("Luas Daerah Yang Berwarna Abu - Abu Adalah: " + luasDaerahAbuAbu);
    }
    
}
