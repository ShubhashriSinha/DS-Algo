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
public class practice2 {
    
    	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int m = 1; m <= t; m++) {
		    int n = sc.nextInt();
		    
		    String arr[] = new String[n];
		    
		    for(int i = 0; i < n; i++) {
		        arr[i] = sc.nextLine();
		    }
		    String maxName = new String();
		    int maxNo = 0;
		    for(int i = 0; i < n; i++) {
		        String s = new String(arr[i]);
		        int l = s.length();
		        
		        if(l > maxNo){
		            maxNo = l;
                            maxName = s;
		        }
		        
		    }
		    System.out.println(maxName);
		}
        }            
    
}
