/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.polymorphism;

/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args) {
        
//        Dog d = new Dog();
//        
//        Pet p = d;
//        Animal a = d;
//        
//        d.walk();
//        p.walk();
        greetings("hello, my name is shubhashri", 5);
        
    }
    public static void greetings() {
        System.out.println("Hi, there");
    }
    public static void greetings(String s) {
        System.out.println(s);
    }
    public static void greetings(String s, int count){
        for(int i = 0; i < count; i++){
            System.out.println(s);
        }    
    }
}
