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
public class SeriesSum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        float result = 0;
        
        for(float i = 1; i <= n; i++) {
            
            result += 1/i;
            
        }
        System.out.println(result);
    }
    
}
