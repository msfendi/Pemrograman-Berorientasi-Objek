/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author User
 */
public class Segitiga {
    int luasSegitiga(int a, int t) {
        return((a * t)/2);
    }
    
    double luasSegitiga(int a, double t) {
        return(0.5 * a * t);
    }
    
    double luasSegitiga(double a, int t) {
        return(0.5 * a * t);
    }
    
    double luasSegitiga(double a, double t) {
        return(0.5 * a * t);
    }
    
    static double pytagoras(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    double kelilingSegitiga(int a, int b) {
        double c = pytagoras(a, b);
        return(a + b + c);
    }
    
    double kelilingSegitiga(int a, double b) {
        double c = pytagoras(a, b);
        return(a + b + c);
    }
    
    double kelilingSegitiga(double a, int b) {
        double c = pytagoras(a, b);
        return(a + b + c);
    }
    
    double kelilingSegitiga(double a, double b) {
        double c = pytagoras(a, b);
        return(a + b + c);
    }
}
