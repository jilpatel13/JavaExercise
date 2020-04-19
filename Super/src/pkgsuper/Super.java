/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgsuper;

/**
 *
 * @author jilpatel
 */

class A
{
    public A()
    {
        System.out.println("IN CLASS A");
    }
    public A(int i)
    {
        System.out.println("IN CLASS A int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("IN CLASS B");
    }
    public B(int i)
    {
        super(i);
        System.out.println("IN CLASS B int");
    }
}
public class Super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        B ob = new B(8);
    }
    
}
