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
public class AppConfig {
    
    private AppConfig() {
        
    }
    
    private static AppConfig obj = null;
    
    public static AppConfig getInstance() {
        if(obj == null) {
            obj = new AppConfig();
        }
        return obj;
    }
    
}
