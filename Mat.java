/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author ASUS
 */
public class Mat {

    public void persegi(double s){
        System.out.println("Luas Persegi : "+(s*s));
        System.out.println("Volume Kubus : "+(s*s*s));
        System.out.println("===================================");
    }
    public void persegipanjang(double p, double l, double t){
        System.out.println("Luas Persegi Panjang : " + (p*l));
        System.out.println("Volume Balok : "+ (p*l*t));
        System.out.println("===================================");
    }
    public void segitiga(int a, int t){
        System.out.println("Luas Segitiga : "+ (a*t/2));
        System.out.println("===================================");
    }  
}
