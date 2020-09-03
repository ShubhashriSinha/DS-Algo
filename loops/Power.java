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
public class Power {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = 1;
        for(int i = 0; i < b; i++) {
            
            result *= a;
            
            
            
        }
        System.out.println(result);
    }
}
