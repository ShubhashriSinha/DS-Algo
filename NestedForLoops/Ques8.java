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
public class Ques8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        
        for(int i = 1; i <= n+1; i++) {
           
            int m = x-i+2;
            
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("  ");
            }
            
            for(int j = 1; j <= i-1; j++) {
                System.out.print(m +" ");
                m++;
            }
            for(int j = 1; j <= 1; j++) {
                System.out.print(0 +" ");
            }
            for(int j = 1; j <= i-1; j++) {
                m--;
                System.out.print(m + " ");
                
            }
            
            System.out.println("");   
        }
        
    }
    
}
