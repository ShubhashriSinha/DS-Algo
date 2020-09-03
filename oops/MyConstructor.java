/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops;

class Vehicle {
    
    int wheels;
    int headLights;
    String color;
    
    Vehicle(int wheels) {
        this.wheels = wheels;
        headLights = 2;
    }
    Vehicle(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
        headLights = 2;
    }
}
/**
 *
 * @author user
 */
public class MyConstructor {
    
    MyConstructor() {
        System.out.println("object is now created");
    }
    
    public static void main(String[] args) {
        
//        MyConstructor obj = new MyConstructor();
  
          Vehicle car = new Vehicle(4);
          Vehicle scooty = new Vehicle(2);
          
          Vehicle eRikshaw = new Vehicle(3, "Yellow");
          
          System.out.println(eRikshaw.wheels + " wheels and color = " + eRikshaw.color);
    }
    
}
