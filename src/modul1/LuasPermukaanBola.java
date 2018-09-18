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
public class LuasPermukaanBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        double r ;
        System.out.print("Masukan Nilai jari-jari(r) : ");
        r = masukan.nextInt();
        System.out.println("Rumus = 4 x Pi x r x r");
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.print(" => ");
        System.out.print("Luas Permukaan Bola "+ r*r*22/7*4);
    }
    
}
