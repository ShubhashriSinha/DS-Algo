/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Practice3 {
    public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    String arr2[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
           
	    while(T-- > 0) {
	    String s = sc.next();
	        int n = 0;
                
            String[] arr = s.split("");
        
            for(int i = 0; i < s.length(); i++){
                for(int j = 0; j < 26; j++) {
                    if(arr[i] == arr[j]) {
                        n++;
                }
            }
        }
	    System.out.println(n);
	}
	}
    
}
