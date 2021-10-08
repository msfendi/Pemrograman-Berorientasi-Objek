/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author User
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi o = new Operasi();
        
        int a = o.jumlahkan(3, 4);
        System.out.println(a);
        
        int b = o.jumlahkan(4, 7, -9);
        System.out.println(b);
        
        double c = o.jumlahkan(3.4, -0.002, 0.12313);
        System.out.println(c);
        
        int d = o.kalikan(3, 4);
        System.out.println(d);
        
        int e = o.kalikan(4, 7, -9);
        System.out.println(e);
        
        double f = o.kalikan(3.2, -1.002, -2.123);
        System.out.println(f);
    }
    
}
