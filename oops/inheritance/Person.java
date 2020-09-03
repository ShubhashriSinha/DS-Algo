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
public class Person {
    
    protected String name;
    
    public Person(String name) {
        this.name = name;
        System.out.println("inside person constructor");
    } 
    
    public void walk() {
        System.out.println("person "+ name + " is walking");
    }
    
    public void eat() {
        System.out.println("person "+ name + " is eating");
    }
    public static void laughing() {
        System.out.println("person is laughing");
    }
}
