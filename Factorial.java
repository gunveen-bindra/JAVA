/*
class Factorial{  
 public static void main(String args[]){  
  int i,fact=1;  
  int number=5;//It is the number to calculate factorial    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  

*/
// Factorial program in Java using User Input

import java.util.Scanner;
class Factorial{
public static void main(String args[]) {
int q, a, fact = 1;
System.out.println("Please Enter a number:");
Scanner in = new Scanner(System.in);
q = in.nextInt();
if ( q = 0 )
System.out.println("Please enter a number greater than 0:");
else {
for ( a = 1 ; a <= q ; a++ )
fact = fact*a;
System.out.println("Factorial of "+q+" is = "+fact);
}
}
}

//factorial using recursion 
/*
class Factorial{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=6;//It is the number to calculate factorial    
  fact = factorial(number);   
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
*/