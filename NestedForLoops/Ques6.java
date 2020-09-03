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
public class Ques6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        
      
        for(int i = 1; i <= n; i++) {
            int m = 1;
            
            for(int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print(m++ +"  ");
            }
            
            System.out.println();
        }
        
        
    }
    
}
