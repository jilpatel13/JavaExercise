/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varags;

/**
 *
 * @author jilpatel
 */

class Calc
{
    public int add(int ... i) // varags
    {
        int sum=0;
        for(int k:i)
        {
            sum = sum + k;
        }
        return sum;
    }
}
public class Varags {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calc obj = new Calc();
        int result = obj.add(3,4,5,6,7,8,9);
        
        System.out.println(result);
    }
    
}
