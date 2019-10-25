/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.lat61.bangunruang;

/**
 *
 * @author nama : indri yuliyanti
 *          kls : pbo ulang
 *          nim : 10115109
 *          tugas pert 6 bola basket
 */
public class Bolabasket extends Bangunruang {
    
    private final double jari;

    public Bolabasket(double jari){
        this.jari = jari;
        
        
    }
    

    @Override
    public void volume() {
        double phi = Math.PI;
        double r = Math.pow(jari, 3);
        double v = (4*(phi*r))/3;
        System.out.printf("Volume Bola = %2.2f", v);
       
    
    }
    
    
    
}
   

