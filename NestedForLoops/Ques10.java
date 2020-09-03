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
public class Ques10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            if(i>1 && i<n) {
                for(int k = 1; k <= i-2; k++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            if(i == n & n > 1) {
                for (int l = 1; l <= n-1; l++) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
