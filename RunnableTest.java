//prac 7b
class X implements Runnable
{
public void run()
{
for (int i = 1; i <= 10; i++)
{
System.out.println("\tFrom Thread X : i = " +i);
}
System.out.println("Exit form thread X");
}
}
class RunnableTest
{
public static void main(String args[])
{
X run_obj = new X();
Thread threadX = new Thread(run_obj);
threadX.start();
System.out.println("End of main Thread");
}
}23:31 22-11-2020