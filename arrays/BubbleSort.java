/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author user
 */
public class BubbleSort {
    public static void main(String[] args) {
        
     int a[] = {2, 1, 8, -3, 4, 6, 12};
     int n = a.length;
     
     for(int i = 0; i < n-1; i++) {
         
         boolean sorted = true;
         
         for(int j = 0; j < n-1-i; j++) {
             if(a[j+1] < a[j]) {
                 int temp = a[j+1];
                 a[j+1] = a[j];
                 a[j] = temp;
                 sorted = false;
             }
         }
         if(sorted) break;
     }
        for(int item: a) {
            System.out.print(item + "  ");
        }
    }
}
