/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author jilpatel
 */

class Student
{
    private int rollno;  // Encapsulation  -->> Binding Data with methods.
    private String name;
    
    // Getters and Setters

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setRollno(35);
        s1.setName("JIL");
        
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
        
    }
    
}
