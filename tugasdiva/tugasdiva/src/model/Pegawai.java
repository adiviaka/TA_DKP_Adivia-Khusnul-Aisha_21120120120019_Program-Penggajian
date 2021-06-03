/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author diva
 */
public class Pegawai {
    
    private final String nip;
    private final String name;
    private final Jabatan jabatan;
    private final GajiPokok gajiPokok;
    private boolean statusMenikah;
    private int jumlahAnak;
    
    public Pegawai(String nip, String name, Jabatan jabatan) {
        this.nip = nip.trim();
        this.name = name.trim();
        this.jabatan = jabatan;
        this.gajiPokok = new GajiPokok(this.jabatan);
        this.jumlahAnak = 0;
    }
    
    public String getNIP() {
        return this.nip;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setStatusMenikah(boolean status) {
        this.statusMenikah = status;
        if (!status) this.jumlahAnak = 0;
    }
    
    public boolean getStatusMenikah() {
        return this.statusMenikah;
    }
    
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    
    public int getJumlahAnak() {
        return this.jumlahAnak;
    }
    
    public Jabatan getJabatan() {
        return this.jabatan;
    }
    
    public int getGajiPokok() {
        return this.gajiPokok.getAmount();
    }
    
    public int getTunjanganIstri() {
        if (this.statusMenikah)
            return this.gajiPokok.getTunjanganIstri();
        return 0;
    }
    
    public int getTunjanganAnak() {
        return this.gajiPokok.getTunjanganAnak(this.jumlahAnak);
    }
    
    public int getPajak() {
        return this.gajiPokok.getPajak();
    }
}
