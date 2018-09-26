/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasModul3;

/**
 *
 * @author ARJUNA
 */
public class Sekolah {

    private String kantin;
    private int stan;
    private int jumlah;

    public Sekolah(String kantin, int stan) {
        this.kantin = kantin;
        this.stan = 12;
    }

    public void info() {
        System.out.println("Lokasi = " + this.kantin);
        System.out.println("Jumlah Stan = " + this.stan);

    }
}
