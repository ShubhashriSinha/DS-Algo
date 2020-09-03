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
public class Ques9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       
        
        for (int i = 1; i <= n; i++) {
            
            if(i==1) {
                System.out.println("* ");
            }
                
            if(i > 1 && i < n) {
                System.out.print("* ");
                for(int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.println("* ");
            }    
            if (i == n && n > 1){
             for(int j = 1; j <= n; j++) {
                 System.out.print("* ");
             }
            }
            }
         
            
        }
        
    }
    

