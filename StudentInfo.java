import java.io.*;

import java.util.*;

class Student

{

   Scanner sc=new Scanner(System.in);

   int RollNo,Total=0,subjects;

   String name;

   int marks[];

   Student()

   {

      System.out.print("Enter Roll No: ");

      RollNo=sc.nextInt();

      System.out.print("Enter Student Name: ");

      name=sc.next();;

      getDisMarks();

   }

   public void getDisMarks()

   {

       marks=new int[2];

       System.out.print("Enter marks of Java: ");

       marks[0]=sc.nextInt();

       System.out.print("Enter marks of Computer Networks: ");

       marks[1]=sc.nextInt();

       for(int i=0;i<2;i++)

       {

          Total+=marks[i];

       }

       System.out.println("Total Marks of student "+name+" is : " +Total);

   }

}

class StudentInfo

{

    public static void main(String args[])

    {

        Student s=new Student();

     }

}