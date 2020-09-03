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
public class PalindromeNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        int temp = n;
        int reverseNumber = 0;
        
        while(temp > 0) {
            int lastDigit = temp % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            
            temp /= 10;
        }
        if(reverseNumber == n) {
            System.out.println(n +" is palindrome");
        } else {
            System.out.println(n + " is not palindrome");
        }
    }
    
}
