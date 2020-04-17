/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author jilpatel
 */

class Casio
{
    public void add(int i, int j)
    {
        System.out.println(i+j);
    }
    
    public void add(int i, int j, int k)
    {
        System.out.println(i+j+k);
    }
    
    public void add(double i, double j)
    {
        System.out.println(i+j);
    }
}
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Casio obj = new Casio();
        
        obj.add(5, 4);
        obj.add(5, 4, 1);
        obj.add(2.9,6.1);
    }
    
}
