/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;
import java.util.Scanner;
/**
 *
 * @author ARJUNA
 */
public class Tugas1 {

    private double penumpang;
    private double maxpenumpang;
    private double penumpangbaru;
    private double berat;
    private double total;
    private double average;
    private double password;
    
        public Tugas1(double maxpenumpang){
                this.maxpenumpang = maxpenumpang;
                penumpang = 0;
            }
            public void addpenumpang(double penumpang){
                double temp ;
                temp = this.penumpang + penumpang;
                if(temp > maxpenumpang){
                    System.out.println("Penumpang Melebihi Kuota !!");
                }else { 
                    this.penumpang = temp;
                }
            }
            public void getpenumpang(int password){
                if(password == 24){
                    System.out.println("Password Benar ");
                }else{
                    System.out.println("Password Salah ");
                }
            }
            public double getavarage(){
                average = berat / penumpang;
        return average;
            }
            public void cetakpenumpang(){
                System.out.println("Penumpang Bus Sekarang : " + penumpang);
                System.out.println("Maksimum Penumpang yang Sebernarnya Adalah : " + maxpenumpang);
            }            

    public double getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(double penumpang) {
        this.penumpang = penumpang;
    }

    public double getMaxPenumpang() {
        return maxpenumpang;
    }

    public void setMaxPenumpang(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getPassword() {
        return password;
    }

    public void setPassword(double password) {
        this.password = password;
    }
}
    
    
        
    
    

