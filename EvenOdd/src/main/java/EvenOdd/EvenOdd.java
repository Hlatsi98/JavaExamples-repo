/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvenOdd;

/**
 *
 * @author Mahlatse=bin
 */
import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        int number;
        Scanner console = new Scanner(System.in);
        
        System.out.println("Please enter an integer.");
        number = console.nextInt();
        
        if (number % 2==0)
        {
            System.out.println("This is an Even number!");
        
        }
        else
        {
             System.out.println("This is an Odd number!");
        }
    
    }

}
