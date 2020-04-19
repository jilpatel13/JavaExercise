/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicmethoddispatch;

/**
 *
 * @author jilpatel
 */

class A           // super , parent
{
    public void show()
   {
       System.out.println("In class A");
   }
}

class B extends A // sub , child
{
   @Override
   public void show()
   {
       System.out.println("In class B");
   }
}

class C extends A // sub , child
{
   @Override
   public void show()
   {
       System.out.println("In class C");
   }
}

public class DynamicMethodDispatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        A ob = new B();  // runtime polymorphism
        ob.show();
        
        ob = new C(); // dynamic method dispatch
        ob.show();
    }
    
}
