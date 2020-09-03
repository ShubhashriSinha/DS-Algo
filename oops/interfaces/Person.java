/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.interfaces;

/**
 *
 * @author user
 */

public class Person implements Student, YouTuber {
    
    public static void main(String[] args) {
        Person obj = new Person();
//        obj.study();
//        obj.makeVideos();
        
        YouTuber obj2 = obj;
        obj2.editVideos();
        obj2.makeVideos();
        
    }

    @Override
    public void study() {
        System.out.println("Person is studying");
    }

    @Override
    public void makeVideos() {
        System.out.println("person is making a good video");
    }

    @Override
    public void editVideos() {
         System.out.println("Youtuber is editing video");
    }
    
}
