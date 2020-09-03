/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.singletons;

/**
 *
 * @author user
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        AppConfig obj = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
        
    }
    
}
