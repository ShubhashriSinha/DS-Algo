/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInput;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ScannerUserInput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();
        
        float simpleInterest = principal * rate * time / 100;
        
       
        
        
        
        System.out.println("the simple interest is " + simpleInterest);
    }
    
}
