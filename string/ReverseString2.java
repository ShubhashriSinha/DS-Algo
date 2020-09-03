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
public class ReverseString2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int i = s.length()-1;
        String ans = "";
        
        while( i >=0 ){
            
            while( i >=0 && s.charAt(i) == ' ') i--;
            
            int j = i;
            
            if(i < 0) break;
            while( i >= 0 && s.charAt(i) != ' ') i--;
            
            if(ans.isEmpty()){
                ans = ans.concat(s.substring(i+1, j+1));
            } else {
                ans = ans.concat(" " + s.substring(i+1, j+1));
            }
            
        }
        System.out.println(ans);
    }
    
}
