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
public class ElseIfClass {
    
    public static void main(String[] args) {
        
        int number = 23;
        
        if(number <= 10) {
            System.out.println("number is less than 10");
        
        } else if(number > 10 && number <= 20) {
            System.out.println("greater than 10 an less than 20");
        }   else if (number > 20 && number <= 30) {
            System.out.println("greater than 20 anf less than 30");
        } else {
            System.out.println("number is greater than 30");
        }
        
    }
    
    
}
