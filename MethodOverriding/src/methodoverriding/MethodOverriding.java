/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverriding;

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
       super.show();
       System.out.println("In class B");
   }
}
public class MethodOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        B ob = new B();
        ob.show();
    }
    
}
