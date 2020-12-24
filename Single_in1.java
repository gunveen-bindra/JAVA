class A
{
int length;
int breadth;
void getA(int x, int y)
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
void getB(int z)
{
height = z;
}
int volume()
{
return(length*breadth*height);
}
}
class Single_in1
{
public static void main(String args[])
{
B b1=new B();
b1.getA(12,10);
b1.getB(8);
int area1=b1.area();
int volume1=b1.volume();
System.out.println("Area="+area1);
System.out.println("Volume="+volume1);
}
}
