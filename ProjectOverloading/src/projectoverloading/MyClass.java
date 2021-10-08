/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoverloading;

/**
 *
 * @author User
 */
public class MyClass {
    void myMethod(){
        System.out.println("Hello");
    }
    
    void myMethod(int x){
        System.out.println("Holla");
    }
    
    void myMethod(int x, int y){
        System.out.println("Hollo");
    }
    
    void myMethod(double x){
        System.out.println("Hilli");
    }
    
    void myMethod(int x, double y){
        System.out.println("Hullo");
    }
    
    String myMethod2(){
        return "Hello";
    }
    
    void myMethod2(int a, int b){
        System.out.println("Holli");
    }
}
