/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author User
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        
//      Panjang: 10, Lebar: 5
        int la = pp.luasPersegiPanjang(10, 5);
        System.out.println(la);
        
        int ka = pp.kelilingPersegiPanjang(10, 5);
        System.out.println(ka);
        
//      Panjang: 3.6, Lebar: 8
        double lb = pp.luasPersegiPanjang(3.6, 8);
        System.out.println(lb);
        
        double kb = pp.kelilingPersegiPanjang(3.6, 8);
        System.out.println(kb);
        
//      Panjang: 6, Lebar: 8.3
        double lc = pp.luasPersegiPanjang(6, 8.3);
        System.out.println(lc);
        
        double kc = pp.kelilingPersegiPanjang(6, 8.3);
        System.out.println(kc);
        
//      Panjang: 5.6, Lebar: 8.8
        double ld = pp.luasPersegiPanjang(5.6, 8.8);
        System.out.println(ld);
        
        double kd = pp.kelilingPersegiPanjang(5.6, 8.8);
        System.out.println(kd);
        
        
//        Persegi
        Persegi p = new Persegi();
        
//      Panjang sisi: 4.5
        double le = p.luasPersegi(4.5);
        System.out.println(le);
        
        double ke = p.kelilingPersegi(4.5);
        System.out.println(ke);
        
//      Panjang sisi: 7
        int lf = p.luasPersegi(7);
        System.out.println(lf);
        
        int kf = p.kelilingPersegi(7);
        System.out.println(kf);
        
        
//        Lingkaran
        Lingkaran l = new Lingkaran();
        
//      Jejari: 5
        double lg = l.luasLingkaran(5);
        System.out.println(lg);
        
        double kg = l.kelilingLingkaran(5);
        System.out.println(kg);
        
//      Jejari: 7.4
        double lh = l.luasLingkaran(7.4);
        System.out.println(lh);
        
        double kh = l.kelilingLingkaran(7.4);
        System.out.println(kh);
        
        
//        Segitiga
        Segitiga s = new Segitiga();
        
//      Panjang alas: 8, Tinggi: 10
        int li = s.luasSegitiga(8, 10);
        System.out.println(li);
        
        double ki = s.kelilingSegitiga(8, 10);
        System.out.println(ki);
        
//      Panjang alas: 8, Tinggi: 11.5
        double lj = s.luasSegitiga(8, 11.5);
        System.out.println(lj);
        
        double kj = s.kelilingSegitiga(8, 11.5);
        System.out.println(kj);
        
//      Panjang alas: 12.2, Tinggi: 9
        double lk = s.luasSegitiga(12.2, 9);
        System.out.println(lk);
        
        double kk = s.kelilingSegitiga(12.2, 9);
        System.out.println(kk);
        
//      Panjang alas: 13.9, Tinggi: 20.7
        double ll = s.luasSegitiga(13.9, 20.7);
        System.out.println(ll);
        
        double kl = s.kelilingSegitiga(13.9, 20.7);
        System.out.println(kl);
    }
}
