//A java program that reverses five integers using arrays
package com.mycompany.arrays;
import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
       int number, res,i,j=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        number = input.nextInt();
        int array[] = new int[number];
        int rev[] = new int[number];
        System.out.println("Enter "+number+" elements ");
        for( i=0; i < number; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println("Reverse of an array is :");
        for( i=number;i>0 ; i--,j++)
        {
            rev[j] = array[i-1];
            System.out.println(rev[j]);
    
        }

    }
}
