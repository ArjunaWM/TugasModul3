/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author ARJUNA
 */
public class PraktikumBus {

    private double Penumpang;
    private double MaxPenumpang;
    private double penumpangBaru;
    
    public PraktikumBus(int MaxPenumpang) {
        this.MaxPenumpang = MaxPenumpang;
        Penumpang = 0;
    }
    
    public void addPenumpang(double Penumpang) {
        double temp;
        temp = this.Penumpang+Penumpang;
        if (temp >= MaxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.Penumpang = temp;
        }
    }
    public void getpenumpang(int password)
    {
        if(password==24)
        {
            System.out.println("Password Benar");
        }else{
            System.out.println("Password salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus sekarang adalah " + Penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + MaxPenumpang);
    }
    
}
    
    

