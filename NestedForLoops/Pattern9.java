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
public class Pattern9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        
        System.out.println("*");
        
        for(int i = 2; i <= n-1; i++) {
            System.out.print("* ");
            
            for(int j = 1; j <= i - 2; j++ ){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println("");
        }
        if(n > 1) {
        for(int k = 1; k <= n; k++) {
            System.out.print("* ");
        }
        }
    }
}
