/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.util.Scanner;
/**
 *
 * @author ARJUNA
 */
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        int nilai;
        System.out.print(" Masukkan nilai akhir pbo : ");
        nilai = masukan.nextInt();
        if(nilai < 70)
            System.out.print(" Siswa tidak lulus ");
        if(nilai > 70)
            System.out.print(" Siswa lulus ");       
    }
    
}
