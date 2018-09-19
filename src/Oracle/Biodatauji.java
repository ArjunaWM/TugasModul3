/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oracle;
import java.util.Scanner;
/**
 *
 * @author ARJUNA
 */
public class Biodatauji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Biodata diri = new Biodata();
        
        diri.setNamaAyah("Ari Mariyadi");        
       
        diri.setNamaIbu("Endang Siswati ");                
      
        diri.setNamaSaudara("M. Iqbal Farza Putra ");   
        
        diri.setNama("Arjuna Wira Mahardika");        
        
        diri.setAlamat("JL.Manukan Madya II/43 Blok 34A");        
        
        diri.setTmptlahir("Surabaya");        
        
        diri.setTgllahir("30 Agustus 2003");        
        
        diri.setHobi("Makan, Game, dan Sepakbola ");        
        
        diri.setCita("Programmer");
       
        diri.setTlp("0813-3907-3815");
        
        System.out.println("Nama Ayah : " + diri.getNamaAyah());
        
        System.out.println("Nama Ibu : " + diri.getNamaIbu());
        
        System.out.println("Nama Saudara : " + diri.getNamaSaudara());
        
        System.out.println("Nama : " + diri.getNama());
        
        System.out.println("Alamat : " + diri.getAlamat());
        
        System.out.println("Tempat Lahir : " + diri.getTmptlahir());
        
        System.out.println("Tanggal Lahir : " + diri.getTgllahir());
        
        System.out.println("Hobi : " + diri.getHobi());
        
        System.out.println("Cita-cita : " + diri.getCita());
        
        System.out.println("Nomor Telepon : " + diri.getTlp());
    } 
      
}
