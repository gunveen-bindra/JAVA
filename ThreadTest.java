//vo hame lagta prallely karta hai but actually processor shiftsa little
//eg class a den b den c den a
//prac7b
import java.lang.Thread;
class A extends Thread
{
public void run()
{
for (int i = 1; i <= 5; i++)
{
System.out.println("\tFrom Thread A : i = " +i);
}
System.out.println("Exit form A");
}
}
class B extends Thread
{
public void run()
{
for (int j = 1; j <= 5; j++)
{
System.out.println("\tFrom Thread B : j = " +j);
}
System.out.println("Exit form B");
}
}
class C extends Thread
{
public void run()
{
for (int k = 1; k <= 5; k++)
{
System.out.println("\tFrom Thread C : k = " +k);
}
System.out.println("Exit form C");
}
}
class ThreadTest
{
public static void main(String args[])
{
new A().start();
new B().start();
new C().start();
}
}