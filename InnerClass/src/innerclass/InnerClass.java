/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclass;

/**
 *
 * @author jilpatel
 */

class Outer
{
    int a;
    public void show()
    {
        System.out.println("in show");
    }
    
   class Inner // class filename -->> Outer$Inner.class
   {
       public void display()
       {
           System.out.println("in display");
       }
   }
   
   static class Inner1
   {
       public void display1()
       {
           System.out.println("in display1");
       }
   }
}
public class InnerClass {

    
    public static void main(String[] args) {
       
        Outer obj = new Outer();
        obj.show();
        
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
        
        Outer.Inner1 obj2 = new Outer.Inner1(); // for static inner class no need to use object of it. 
        obj2.display1();
    }
    
}
