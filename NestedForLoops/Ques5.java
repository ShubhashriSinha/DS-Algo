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
public class Ques5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= 2*n+1; i++) {
            
            if(i <= n) {
                for(int j = 1; j <= n-i+1; j++) {
                    System.out.print("* ");
                }
                for(int k = 1; k <= 2*i-1; k++) {
                    System.out.print("  ");
                }
                for(int l = 1; l <= n-i+1; l++) {
                    System.out.print("* ");
                }
            }
            if(i == n+1) {
                for(int j = 1; j <= 2*i+1; j++) {
                    System.out.print("  ");
                }
            } else {
                for(int j = 1; j <= i-n-1; j++) {
                    System.out.print("* ");
                }
                for(int k = 1; k <= 4*n-2*i+3; k++) {
                    System.out.print("  ");
                }
                for(int l = 1; l <= i-n-1; l++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }
       
}
