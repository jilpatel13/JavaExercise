/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiskeyword;

/**
 *
 * @author jilpatel
 */

class Calc
{
    int num1;
    int num2;
    
    public Calc(int num1,int num2) // create constructor
    {
        this.num1 = num1;
        this.num2 = num2;
       
    }
    
   
}
public class ThisKeyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calc obj = new Calc(5,4);
        
        System.out.println(obj.num1);
        System.out.println(obj.num2);

    }
    
}
