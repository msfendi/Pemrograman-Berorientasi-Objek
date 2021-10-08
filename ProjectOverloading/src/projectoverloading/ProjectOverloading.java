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
public class ProjectOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass m = new MyClass();
        
        m.myMethod();
        m.myMethod(1.20);
        m.myMethod(2, 2.0);
    }
    
}
