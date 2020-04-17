/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statickeyword;

/**
 *
 * @author jilpatel
 */

class Student
{
    int sid;
    int marks;
    static String prof;
    
    public void show()
    {
        System.out.println(sid + ":" + marks + ":" + prof);
    }
    
    static
    {
        prof="jack";
    }
}
public class StaticKeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s1 = new Student();
        
        s1.sid=001;
        s1.marks=99;
        Student.prof="john";
        
        Student s2 = new Student();
        
        s2.sid=002;
        s2.marks=89;
        Student.prof="john"; // to access static variable we don't need object.
        
        Student.prof="jack";
        
        s1.show();
        s2.show();
    }
    
}
