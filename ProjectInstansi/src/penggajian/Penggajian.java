/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penggajian;

/**
 *
 * @author User
 */
public abstract class Penggajian {
    public abstract double gajiPokok();
    public abstract double tunjanganIstriSuami();
    public abstract double tunjanganPegawai();
    public abstract double tunjanganAnak();
    
    public void hitungGaji() {
        double gajiKotor = gajiPokok() + tunjanganIstriSuami() + tunjanganPegawai() + tunjanganAnak();
        double potongan = 0.025 * gajiKotor;
        double gajiBersih = gajiKotor - potongan;
        
        System.out.println("------------------------------------");
        System.out.println("Gaji Pokok : Rp." + gajiPokok());
        System.out.println("Tunjangan Istri/Suami : Rp." + tunjanganIstriSuami());
        System.out.println("Tunjangan Pegawai : Rp." + tunjanganPegawai());
        System.out.println("Tunjangan Anak : Rp." + tunjanganAnak());
        System.out.println("---------------------------------- +");
        System.out.println("Gaji Kotor : Rp." + Double.valueOf(gajiKotor).longValue());
        System.out.println("Potongan : Rp." + potongan);
        System.out.println("---------------------------------- -");
        System.out.println("Gaji Bersih : Rp." + Double.valueOf(gajiBersih).longValue());
    }
}
