class Rect_pr1_a
{
public static void main(String args[])
{
float l = Float.parseFloat(args[0]);//for floating point nos we use parseFloat
float b = Float.parseFloat(args[1]);
float area = l*b;
float perimeter = 2*(l+b);
System.out.println("Area of a rectangle: " +area);
System.out.println("Perimeter of a rectangle: " +perimeter);
}
}
