package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diva
 */
public class GajiPokok {
    
    private final Jabatan jabatan;
    private final int gajiPokok;
    
    public GajiPokok(Jabatan jabatan) {
        this.jabatan = jabatan;
        final String jabatanName = this.jabatan.getName().toLowerCase();
        if (jabatanName.equals("direktur")) this.gajiPokok = 7500000;
        else if (jabatanName.equals("manajer")) this.gajiPokok = 5000000;
        else if (jabatanName.equals("kabag")) this.gajiPokok = 3000000;
        else if (jabatanName.equals("sekretaris")) this.gajiPokok = 2000000;
        else if (jabatanName.equals("karyawan")) this.gajiPokok = 1200000;
        else if (jabatanName.equals("office boy")) this.gajiPokok = 750000;
        else this.gajiPokok = 0;
    }
    
    public int getAmount() {
        return this.gajiPokok;
    }
    
    public int getTunjanganIstri() {
        return (int)(this.gajiPokok * 0.2);
    }
    
    public int getTunjanganAnak(final int jumlahAnak) {
        if (jumlahAnak >= 2) return (int)(this.gajiPokok * 0.15 * 2);
        else if (jumlahAnak > 0) return (int)(this.gajiPokok * 0.15);
        return 0;
    }
    
    public int getPajak() {
        return (int)(this.gajiPokok * 0.1);
    }
}
