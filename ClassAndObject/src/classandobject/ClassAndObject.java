/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classandobject;

/**
 *
 * @author jilpatel
 */


class Calc
{
    int num1;
    int num2;
    int result;
    
    public void perform()
    {
        result = num1 + num2;
    }
}
public class ClassAndObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calc obj = new Calc(); // create object
        obj.num1=3;
        obj.num2=5;
        
        obj.perform();
        
        System.out.println(obj.result);
    }
    
}
