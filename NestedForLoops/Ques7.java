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
public class Ques7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        int m = 1;
        int l = 2;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= 1; j++) {
                System.out.print(m++ +" ");
            }
            if(i>1) {
                for(int j = 1; j <= 2*i-3; j++) {
                    System.out.print("0 ");
                }
                for(int j = 1; j <= 1; j++) {
                    System.out.print(l++ +" ");
                }
            }
            System.out.println();
        }
    }
}
