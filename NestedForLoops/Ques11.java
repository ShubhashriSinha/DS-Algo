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
public class Ques11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 2;
        
        for(int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            System.out.print(1 + "   ");
            
            if(i >= 3 && i <= n) {
                for(int k = 1; k <= i-2; k++) {
                    System.out.print(m + "   ");
                }
                m++;
            }
            if(i > 1) {
                System.out.println(1 + "   ");
            }
            System.out.println();
        }
        
    }
    
}
