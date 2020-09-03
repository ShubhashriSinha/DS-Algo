/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ReverseString {
    
    public static void main(String[] args) {
        System.out.println("Enter your string");
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
       
        String words[] = input.split(" ");
        int n = words.length;
        
        String reverse[] = new String[n];
        
        String s = words[n-1];
        for(int i = n-2; i >= 0; i--) {
            s = s.concat(" "+ words[i]);
            
        }
        
//        for(String output: 0reverse){
//            System.out.print(output);
//        }
        
        System.out.println("Reverse output :" +s);
    }
    
}
