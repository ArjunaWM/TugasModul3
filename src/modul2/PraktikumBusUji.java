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
public class PraktikumBusUji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PraktikumBus Bus = new PraktikumBus(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        
        Bus.addPenumpang(2);
        Bus.cetakpenumpang();
        
        Bus.addPenumpang(1);
        Bus.cetakpenumpang();
        
        Bus.addPenumpang(2);
        Bus.cetakpenumpang();
        
        Bus.addPenumpang(2);
        Bus.cetakpenumpang();
    }
    
}
