/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedForLoops;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pattern8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i <= n-1; i++) {
//            for(int j = 1; j <= n-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
   
        for(int i = 1; i <= n+n-1; i++) {
            if(i <= n) {
                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }
            }else {
                for(int j=1; j <= 2*n-i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
   
}
