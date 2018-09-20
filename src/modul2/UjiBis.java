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
public class UjiBis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] abc) {
        // TODO code application logic here
        Bis bis = new Bis(5);
        bis.getPenumpang(17);
        bis.getPenumpang(24);
        bis.cetakpenumpang();
        
        bis.addPenumpang(2);
        bis.cetakpenumpang();
        
        bis.addPenumpang(1);
        bis.cetakpenumpang();
        
        bis.addPenumpang(2);
        bis.cetakpenumpang();
        
        bis.addPenumpang(2);
        bis.cetakpenumpang();
                     
    }
    
}
