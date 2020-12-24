//Write a program to find smallest and 
//largest element from an array

import java.util.*;
class LargestSmallest {
 
 public static void main(String[] args) {
 

 System.out.println("Eneter the number of elements");
        Scanner sc=new Scanner(System.in);
       
        int  n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            numbers[i] = sc.nextInt();
        }
 
 
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

