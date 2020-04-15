/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakandcontinue;

/**
 *
 * @author jilpatel
 */
public class BreakAndContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++)
        {
            if(i==7)
            {
                continue;
            }
            System.out.println("Value is: " + i);
        }
        
        for(int j=10;j<=15;j++)
        {
            if(j>13)
            {
                break;
            }
            System.out.println("Value is: "+j);
        }
    }
    
}
