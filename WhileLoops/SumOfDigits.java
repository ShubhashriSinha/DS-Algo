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
public class SumOfDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System .in);
        long n = sc.nextLong();
//        int temp = n;
//        int sum = 0;
//        
//        while(temp > 0) {
//            
//            int lastDigit = temp % 10;
//            temp /= 10;
//            
//            sum += lastDigit;
//            
//        }
//        System.out.println("the sum of digits of " + n + " is " + sum);
    
    int numberOfDigits = (int)Math.log10(n) + 1;
        System.out.println(numberOfDigits);
    }
    
    
}
