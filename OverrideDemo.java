//OverrideDemo.java
//prac6b
/*By default derived class/sub class method is called,if we want to call parent class
method then same method should be called with super keyword*/
class Add//parent class
{
public void getResult(int a,int b)//if you dont put
{
System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
}
}
class Multiply extends Add //subclass 
{
public void getResult(int a,int b)

{
super.getResult(a,b);
System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
}
}
class Divide extends Multiply//subclass
{
public void getResult(int a,int b)
{
super.getResult(a,b);
System.out.println("Division of "+a+" and "+b+" is "+(a/b));
}
}
class OverrideDemo //main class
{
public static void main(String args[])
{
Divide d=new Divide();
d.getResult(12,4);  
}
}