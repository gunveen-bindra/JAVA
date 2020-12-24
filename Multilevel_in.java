class A
{
void sqr(int a)
{
System.out.println(a*a);
}
}
class B extends A
{
void cube(int b)
{System.out.println(b*b*b);
}
}
class C extends B 
{
void display()
{
System.out.println("Multilevel inheritance");
}
}

class Multilevel_in
{
public static void main(String args[])
{
C s=new C();
s.sqr(2);
s.cube(3);
s.display();
}
}