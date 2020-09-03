/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.inheritance;

/**
 *
 * @author user
 */
public class Singer extends Person{
    
    public Singer(String name) {
        super(name);
        
    }
    
    public void sing() {
        System.out.println(name + " is singing");
    }
    public void eat() {
        System.out.println("singer " + name + " is eating");
    }
    public static void laughing() {
        System.out.println("singer is laughing");
    }
}
