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
public class Latihan11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        int a=0, total=0, bil=7;
        while (bil!=0){
            a++;
             System.out.println("Masukkan Bilangan ke-"+a+" : ");
             bil = masukan.nextInt();
             total += bil;
        }
         System.out.println("Total Jumlah"+(a-1)+"bilangan : ");
         System.out.println(total);
    }
    
}
