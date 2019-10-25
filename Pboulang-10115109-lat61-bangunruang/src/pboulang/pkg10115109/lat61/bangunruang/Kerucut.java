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
 *          tugas pert 6 kerucut
 */
public class Kerucut extends Bangunruang {
    private final double jari;
    private final double tinggi;
    

    public Kerucut(double jari,double tinggi){
        this.jari = jari;
        this.tinggi = tinggi;
        
        
    }

    

    @Override
    public void volume() {
        double phi = Math.PI;
        double r = Math.pow(jari, 2);
        double v = (phi*r*tinggi)/3;
        System.out.printf("Volume Kerucut = %2.2f", v);
        
    }
    
}
