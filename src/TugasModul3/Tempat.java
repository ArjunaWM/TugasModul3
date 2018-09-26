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
public class Tempat extends Sekolah {

    private String lokasi;

    public Tempat (String lokasi, String kantin, int stan)
    {
        super(kantin, stan);
        this.lokasi = lokasi;
    }
    public void info() {
        System.out.println("Tempat = " + this.lokasi);
        super.info();    }
    
}
