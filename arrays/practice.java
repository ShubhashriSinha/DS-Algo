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
public class practice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
		int t = sc.nextInt();
	        for(int m = 1; m <= t; m++) {
		int n = sc.nextInt();
		
		int d = sc.nextInt();
		
                     
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[n];
		
		for(int j = d; j <= n-1; j++) {
		    for(int k = j - d; k <= n-1-d; k++) {
                        arr2[k] = arr[j];
                    }
		}
                for(int j = 0; j <= d-1; j++) {
		    for(int k = j+n-d; k <= n-1; k++) {
                        arr2[k] = arr[j];
                    }
		}
                for(int number: arr2) {
                    System.out.print(number + " ");
                }
                     System.out.println("");
                 }        
    }
    
}
