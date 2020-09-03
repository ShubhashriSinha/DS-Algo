/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

import oops.A.B;
import oops.A.C;

/**
 *
 * @author user
 */
public class StaticKeyword {
    
    static {
        System.out.println("in block 1");
    }
    
    static {
        System.out.println("in block 2");
    }
    
    public static void main(String[] args) {
        
        System.out.println("inside main");
        
        A objA = new A();
        B objB = objA.new B();
        
        C objC = new A.C();
        
    }
    static {
        System.out.println("in block 3");
    }
}
