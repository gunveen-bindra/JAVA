//finding roots of quadratic equation
//x=(-b+-sqrt(b*b-4ac))/2a where b2-4ac is called discriminant
import java.lang.Math;
class Quadratic
{
public static void main(String args[])
{
float a,b,c,d,x;
double x1,x2;
//a=1;b=2;c=3;

a=Float.parseFloat(args[0]);
b=Float.parseFloat(args[1]);
c=Float.parseFloat(args[2]);
System.out.println("coefficiants a,b,c are "+a+" "+b+" "+c);
d=b*b-4*a*c;
if(d>0)
{
x1=(-b+Math.sqrt(d))/2*a;
x2=(-b-Math.sqrt(d))/2*a;
System.out.println("Roots are real and unequal");
System.out.println("x1="+x1);
System.out.println("x2="+x2);
}
else if(d==0)
{
x=-b/(2*a);
System.out.println("Roots are real and equal");
System.out.println("x="+x);
}
else
System.out.println("No real roots,roots are complex");
}
}
