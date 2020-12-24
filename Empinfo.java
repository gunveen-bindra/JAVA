import java.io.*;
class Employee
{
String name;
int id;
int salary;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void get()
{
try
{
System.out.println("enter the id");
id=Integer.parseInt(br.readLine());
System.out.println("enter the name");
name=br.readLine();
System.out.println("enter the salary");
salary=Integer.parseInt(br.readLine());
}
catch(Exception e)
{
System.out.println(e);
}
}
void show()
{
System.out.println("id is " +id);
System.out.println("Name is " +name);
System.out.println("Salary is " +salary);
}
}
class Empinfo
{
public static void main(String args[])
{
Employee e1=new Employee();
e1.get();
e1.show();
}
}