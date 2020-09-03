/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops.exceptionHandling;

/**
 *
 * @author user
 */
public class MainClass {
    
      public static void main(String[] args) {
//        try{
////        int a = 5;
////        int b = 0;
////        int c = a/b; 
//        int a[] = new int[5];
//        
//        System.out.println(a[6]);       
//        } catch(ArithmeticException e) {
//            System.out.println(e.getMessage() + " occured, please check your code");
////              System.out.println("Exception");        
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("index should be in range of 0 to size of array");
//        } catch(IllegalArgumentException e) {
//            System.out.println("check your casting carefully");
//        } finally {
//            System.out.println("Sorry for the inconvenience.");
//        }
//        System.out.println("Very important code");
//        System.out.println("Need to run");
//    
            fun1();
    }
        static void fun1() {
            int a = 5;
            int b = 3;
            int c = a/b; 
            System.out.println(c); 
            try {
           fun2();
            } catch(Exception e) {
                System.out.println(e.getMessage() + " accured");
            }
        }
        static void fun2() throws ArrayIndexOutOfBoundsException{
             boolean isDanger = true;
            if(isDanger) {
                throw new ArrayIndexOutOfBoundsException("danger was coming");
            }
        }
}
