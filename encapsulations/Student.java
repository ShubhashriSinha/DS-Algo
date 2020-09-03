/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulations;

/**
 *
 * @author user
 */
public class Student {
    
    private int age;
    private String name;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if(age > 20) {
            System.out.println("you are too old to be a student in our school");
        } else {
            this.age =  age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
    }
    
}
