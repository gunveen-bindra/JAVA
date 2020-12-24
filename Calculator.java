//pr10a - 2) Scanner example
import java.util.Scanner;
public class Calculator
{
 public static void main(String args[])
 {
  float a, b, res;
  char choice, ch;
  Scanner scan = new Scanner(System.in);
  
  do
  {
  System.out.println("1. Addition\n"); 
  System.out.println("2. Subtraction\n"); 
  System.out.println("3. Multiplication\n"); 
  System.out.println("4. Division\n"); 
  System.out.println("5. Exit\n"); 
  System.out.println("Enter your choice: ");

  //s.next() returns the next String object. 
  //But s.next().charAt(0) returns the first character of the next String object.

  choice = scan.next().charAt(0);
  switch(choice)
   {
	case '1' :   
	System.out.println("Enter Two numbers: ");

	//The nextFloat() method of Java Scanner class is used to scan the next
	//token of the input as a Float. If the translation is successful, 
	//the scanner past the input that matched.
	a = scan.nextFloat();
 	b = scan.nextFloat();  
 	res = a + b;
 	System.out.println("Result = " + res);
 	break;

	case '2' :
	System.out.println("Enter Two numbers: ");
	 a = scan.nextFloat();
	 b = scan.nextFloat();  
	 res = a - b;
	 System.out.println("Result = " + res);
	 break;

	case '3' :
	System.out.println("Enter Two numbers: ");
 	a = scan.nextFloat();
 	b = scan.nextFloat();  
	 res = a * b;
	 System.out.println("Result = " + res);
	 break;

	case '4' :
	System.out.println("Enter Two numbers: ");
 	a = scan.nextFloat();
 	b = scan.nextFloat();  
 	res = a / b;
	 System.out.println("Result = " + res);
 	break;

	case '5' :
	System.exit(0);
 	break;
        
	default :
	System.out.println("Wrong Choice !!");
        break;
   }
   System.out.println("\n--------------------------------------\n");
  }while(choice != 5);
 }
}