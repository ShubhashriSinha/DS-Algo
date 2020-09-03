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
public class PrimeNumbers {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        boolean isPrime = true;
        
        for(int i = 2; i*i <= n; i++) {
            
            if(n % i == 0) {
                isPrime = false;
                break;
            }
            
        }
        if(n < 2) isPrime = false;
        
        System.out.println("isPrime " + isPrime);
    }
    
}
