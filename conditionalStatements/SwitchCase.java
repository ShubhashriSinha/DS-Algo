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
public class SwitchCase {
    
    public static void main(String[] args) {
        
//        int dayOfWeek = 2;
//        
//        switch(dayOfWeek) {
//            case 1 :
//            case 2 :
//                System.out.println("i'm on leave");
//                break; 
//            case 3 :
//                System.out.println("i'm playing football");
//                break;
//                
//            default :
//                System.out.println("i don't kno what day it is");
//        }
       int rating = 1;
       
       switch(rating) {
           case 1 :
           case 2 :
               System.out.println("Bad review");
               break;
           case 3 :
               System.out.println("Average review");
               break;
           case 4 :
           case 5 :    
               System.out.println("Good review");
               break;
       }
        
    }
    
}
