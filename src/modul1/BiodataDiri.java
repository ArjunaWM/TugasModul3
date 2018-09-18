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
public class BiodataDiri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String nama, klmn, tmptl, almt, motto, bln;
        int NIS, tgl, thn;
        
        System.out.print("Nama : ");
        nama = scan.next();
        
        System.out.print("NIS : ");
        NIS = scan.nextInt();
        
        System.out.print("Temapat Lahir : ");
        tmptl = scan.next();
        
        System.out.println("Tanggal : ");        
        tgl = scan.nextInt();
        
        System.out.println("Bulan : ");
        bln = scan.next();
        
        System.out.println("Tahun :");
        thn = scan.nextInt();
        
        System.out.println("Tanggal Lahir : "+ tgl + " " + bln + " " + thn );
        System.out.println("Jenis Kelamin : ");
        klmn = scan.next();
        
        System.out.print("Alamat di Malang : ");
        almt = scan.next();
        
        System.out.print("Motto Hidup : ");
        motto = scan.next();
    }
    
}
