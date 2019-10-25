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
 *          tugas pert 6 tabung
 */
public class Tabung extends Bangunruang {
     

    private final double h;
    private final double r;
    
    
    public Tabung(double r, double h){
        this.h = h;
        this.r = r;
    }

    @Override 
    public void volume() {
        double phi = Math.PI;
        double v = (phi * Math.pow(r, 2) * h);
        System.out.printf("Volume Tabung = %2.2f", v);
   
    }
}
