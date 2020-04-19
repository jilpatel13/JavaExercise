/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author jilpatel
 */

class Calc           // super , parent
{
    public int add(int i, int j)
    {
        return i+j;
    }
}

class Calc1 extends Calc // sub , child
{
    public int sub(int i, int j)
    {
        return i-j;
    }
}

class Calc2 extends Calc1 // sub , child
{
    public int multi(int i, int j)
    {
        return i*j;
    }
}

public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calc2 c1 = new Calc2();
        int result1  = c1.add(3, 6);
        int result2  = c1.sub(9, 1);
        int result3  = c1.multi(4, 2);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
    
}
