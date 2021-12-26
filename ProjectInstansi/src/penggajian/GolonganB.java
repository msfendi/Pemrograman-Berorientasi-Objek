/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penggajian;

import projectinstansi.DataKaryawan;

/**
 *
 * @author User
 */
public class GolonganB extends Penggajian{
    public DataKaryawan dataKar;
    private double tunjIS;
    private double tunjPeg;
    private double tunjAnak;
    
    @Override
    public double gajiPokok() {
        double gajiPokok = 6000000;
        return gajiPokok;
    }
    
    @Override
    public double tunjanganIstriSuami() {
        if(dataKar.status == 1) {
            tunjIS = gajiPokok() * 0.1;
        }
        return tunjIS;
    }
    
    @Override
    public double tunjanganPegawai() {
        if(dataKar.usia > 30) {
            tunjPeg = gajiPokok() * 0.15;
        }
        return tunjPeg;
    }
    
    @Override
    public double tunjanganAnak() {
        double besarTunj = gajiPokok() * 0.05;
        tunjAnak = dataKar.jmlanak * besarTunj;
        return tunjAnak;
    }
}
