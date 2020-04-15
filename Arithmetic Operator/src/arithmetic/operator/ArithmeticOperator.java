/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic.operator;

/**
 *
 * @author jilpatel
 */
public class ArithmeticOperator {

    public static void main(String[] args) {
        int m=6,n=4;
        
        int r1 = m+n;
        int r2 = m-n;
        int r3 = m*n;
        double r4 = (double)m/n;
        int r5 = m%n; 
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        
        n += m; //n=n+m
        System.out.println(n);
        
        m++; // post increment
        System.out.println(m);

        n--;
        System.out.println(n);
        
        ++n; // pre increment
        System.out.println(n);

       int i = 2, j = 3;
       
       i = j++;
       System.out.println(i);
       System.out.println(j);

       
       i = ++j;
       System.out.println(i);
       System.out.println(j);

    
    }
    
}
