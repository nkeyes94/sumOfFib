/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofevenfibbonachi;

import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.LongStream;

/**
 *
 * @author NKeye
 */
public class SumOfEvenFibbonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x = 50;                                                                     //4m is where we will limit the fib sequence to (testing at 10)
        long[] fibSequence = new long[x];
        long[] fibEqual = new long[x];
        
        long a, b, c;
        a = 0;
        b = 1;
        for(int i = 0; i < x; i++)                                                      //Creating a loop for the fib sequence
        {
            c = a + b;                                                                  //Logic for the fib sequence -> x = y + z -> x = z -> x = y + z...
            a = b;
            b = c;
            fibSequence[i] = c;
            System.out.println(fibSequence[i]);
        }
        long sumOfTotal = LongStream.of(fibSequence).sum();                             //Long Stream to find the sum of the LongStream array used to store values of the fib sequence.
        System.out.println("The sum of the fib sequence is: "+ sumOfTotal);
        
        for(int i = 0; i < x; i++)
        {
            if(fibSequence[i] % 2 ==0)
            {
                fibEqual[i] = fibSequence[i];
                System.out.println(fibSequence[i]);
            }
        }
        long sumOfEquals = LongStream.of(fibEqual).sum();
        System.out.println("The sum of the equals in the fib sequence is: "+ sumOfEquals);
    }
    
}
