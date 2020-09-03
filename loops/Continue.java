/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author user
 */
public class Continue {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <= 100; i++) {
            
            if(i >=40 && i <= 50)
                System.out.println("*");
            
            System.out.println(i);
        }
        
    }
    
}
