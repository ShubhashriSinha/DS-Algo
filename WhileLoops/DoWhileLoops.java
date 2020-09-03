/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DoWhileLoops {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int n = 1;
        
        do{
            n = sc.nextInt();
            System.out.println("n is " + n);
            
        }while(n != 0);
    }
    
}
