/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.abstraction;

/**
 *
 * @author user
 */
public class RepairShop {
    
    public static void repairCar(Car car) {
        System.out.println("Car is repaired");
    }
    
    public static void main(String[] args) {
        Wagonar wagonar = new Wagonar();
        Audi audi = new Audi();
        
        repairCar(wagonar);
        repairCar(audi);
    }
    
}
