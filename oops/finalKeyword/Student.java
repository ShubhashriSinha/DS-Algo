/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.finalKeyword;

/**
 *
 * @author user
 */
public final class Student {
    
    int rollNo;
    String name ;
    
//    {
//        rollNo = 24;
//    }
//    
//    public Student() {
//        name = "Anuj";
//    }
    public final void getDescription() {
        System.out.println("The student's name is " + name);
    }
}
