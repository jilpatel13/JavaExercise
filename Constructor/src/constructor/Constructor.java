/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author jilpatel
 */

class Calc
{
    int num1;
    int num2;
    int num3;
    
    public Calc() // create constructor
    {
        num1 = 5;
        num2 = 4;
        System.out.println("In Constructor");
    }
    
    public Calc(int k) // create constructor
    {
        num3 = k;
        System.out.println("Constructor with parameter");
    }
    
    
}
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calc obj = new Calc();
        
        System.out.println(obj.num1);
        
        Calc obj1 = new Calc(8);
        
        System.out.println(obj1.num3);

    }
    
}
