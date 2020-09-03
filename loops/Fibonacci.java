/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        
        System.out.print(a+" ");
        System.out.print(b+" ");
        
        for(int i = 0; i < n-2; i++ ) {
            
            int c = a + b;
            System.out.print(c+ " ");
            a = b;
            b = c;
            
        }
        
    }
    
}
