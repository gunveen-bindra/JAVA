//constructor
//super
class A
{
int length;
int breadth;
A(int x, int y)
{
length = x;
breadth = y;
}
int area()
{
return(length * breadth);
}
}
class B extends A
{
int height;
B(int x,int y,int z)
{
super(x,y);
height = z;
}
int volume()
{
return(length*breadth*height);
}
}
class Single_in
{
public static void main(String args[])
{
B b1=new B(14,12,10);
int area1=b1.area();
int volume1=b1.volume();
System.out.println("Area="+area1);
System.out.println("Volume="+volume1);
}
}

