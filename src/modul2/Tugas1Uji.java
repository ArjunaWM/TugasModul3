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
public class Tugas1Uji {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Tugas1 Bus = new Tugas1(20);

        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
       
        Bus.addpenumpang(1);
        Bus.cetakpenumpang();
      
        Bus.addpenumpang(2); 
        Bus.cetakpenumpang();
      
        Bus.cetakpenumpang();
        Bus.addpenumpang(2); 
        Bus.cetakpenumpang();
        
        Bus.setBerat(70);
        Bus.setMaxPenumpang(15);
        Bus.getavarage();
        System.out.println("Rata - Rata Berat Penumpang : " + Bus.getavarage());
    }

}
            
      
        
        
    
    
