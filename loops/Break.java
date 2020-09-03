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
public class Break {
    
    public static void main(String[] args) {
        
//        for(int i = 1; i <= 100; i++) {
//            
//            if(i==35) {
//                break;
//            }
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        
          for( ; ; ) {
              int n = sc.nextInt();
              
              if(n<0) {
                  break;
              }
          }

    }
    
}
