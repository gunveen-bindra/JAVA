class Rectangle
{
int length;
int breadth;
Rectangle(int a,int b)
{
length=a;
breadth=b;
}

int rectarea()
{
return(length*breadth);
}
}
class prac_4b
{
public static void main(String args[])
{
Rectangle r1=new Rectangle(15,10);
int area1=r1.rectarea();
System.out.println("Area of rectangle is="+area1);
}
}

/*
//parameterized
class Rectangle
{
int length;
int breadth;
Rectangle()
{
length=15;
breadth=10;
}

int rectarea()
{
return(length*breadth);
}
}
class prac_4b
{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
int area1=r1.rectarea();
System.out.println("Area of rectangle is="+area1);
}
}
*/





