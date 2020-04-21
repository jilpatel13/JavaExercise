/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author jilpatel
 */

abstract class Car
{
    public abstract void cartype();
    
}

class Bike extends Car
{
    public void cartype()
    {
        
    }
}
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car ob = new Bike();
    }
    
}
