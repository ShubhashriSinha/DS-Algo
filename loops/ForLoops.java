/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ForLoops {
    
    public static void main(String[] args) {
        
//        for(int i = 0; i < 100; i = i + 1) {
//            
//            System.out.println("Hello World " + i);
//            
//        }

//          for(int i = 0; i <= 100; i = i + 2) {
//              System.out.println(i);
//          }  

//           int sum = 0;
//           int n = 500;
//           for(int i = 1; i <= n; i++) {
//              
//               sum = sum + i;
//               
//               System.out.println(sum);
//               
//           }

//             for(int i = 100; i >= 0; i--) {
//                 
//                 System.out.println(i);
//                 
//             }
//             int tableOf = 23;
             
//             for(int i = 4; i <= 40; i = i + 4) {
//                 System.out.println(i);
//             }
//             for(int i = 1; i <= 10; i++) {
//                    System.out.println(tableOf * i );
//             }   
               Scanner sc = new Scanner(System.in);
               
               int factorial = 1;
               int n = sc.nextInt();
               
               for(int i = n ; i > 0 ; i--) {
                   factorial = factorial * i;
                   System.out.println(factorial);
                   
               }

    }
           
}
