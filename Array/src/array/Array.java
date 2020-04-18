/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author jilpatel
 */
public class Array {

    
    public static void main(String[] args) {
        
        int nums[] = new int[4]; // int nums[] = {10,60,40,15};
        
        System.out.println(nums[2]);
          
        nums[0]=10;
        nums[1]=60;
        nums[2]=40;
        nums[3]=15;
        
        for(int i=0;i<4;i++)
        {
            System.out.println(nums[i]);
        }

                 
    }
    
}
