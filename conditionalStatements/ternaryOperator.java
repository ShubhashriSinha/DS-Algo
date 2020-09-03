/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalStatements;

/**
 *
 * @author user
 */
public class ternaryOperator {
    
    public static void main(String[] args) {
        
        int a = 15;
        int b = 18;
        int maxOfBothNumbers = 0;
        float c = 2.3f;
        
//        if( a > b) {
//            maxOfBothNumbers = a;
//            
//        } else {
//            maxOfBothNumbers = b;
//        }
     
         maxOfBothNumbers = a > b ? a : b;
         
         System.out.println("max of both numbers is " + maxOfBothNumbers  +  c);

    }
    
}
