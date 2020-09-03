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
public class Teacher extends Person {
    
    public Teacher(String name) {
        super(name);
        System.out.println("inside teacher constructor");
    }
    
    public void teach() {
        System.out.println( name+ " is teaching");
    }
    public void eat() {
        super.eat();
        System.out.println("teacher " + name + " is eating");
    }
    public static void laughing() {
        System.out.println("teacher is laughing");
    }
}
