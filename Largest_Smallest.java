//Write a program to find smallest and 
//largest element from an array

import java.io.*;
class Largest_Smallest {
 
 public static void main(String[] args)
{
 int numbers[]={33,9,56,14,85,48};
 //assign first element of an array to largest and smallest
 int smallest = numbers[0];
 int largest = numbers[0];
 
 for(int i=1; i< numbers.length; i++)
 {
 if(numbers[i] > largest)
 largest = numbers[i];
 else if (numbers[i] < smallest)
 smallest = numbers[i];
 
 }
 
 System.out.println("Largest Number is : " + largest);
 System.out.println("Smallest Number is : " + smallest);
 }
}