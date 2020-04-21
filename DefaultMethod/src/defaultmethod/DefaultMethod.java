/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethod;

/**
 *
 * @author jilpatel
 */

interface Abc
{
    default void show()
    {
        System.out.println("In Abc");
    }
}
interface Abcd
{
    default void show()
    {
        System.out.println("In Abcd");
    }
}
 class A implements Abc, Abcd
{
  public void display()
  {
        System.out.println("A");
  }
  public void show()
  {
      Abcd.super.show();
  }
}
public class DefaultMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Abc obj = new A();
        obj.show();
    }
    
}
