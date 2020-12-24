import java.util.*;
class A
{
int n;
A(int x)
{
n = x;
}
int fact()
{
Scanner in = new Scanner(System.in);
int  a, fact = 1;
if ( n < 0 )
System.out.println("Please enter a number greater than 0:");
else {
for ( a = 1 ; a <= n ; a++ )

fact = fact*a;
}
return(fact);
}
}

class B extends A
{
B(int x)
{
super(x);
}
}

class Factorial_Singlein
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Please Enter a number:");
int q = Integer.parseInt(in.nextLine());
B obj =new B(q);
int fac = obj.fact();
System.out.println("Factorial of "+q+" is = "+fac);
}
}
