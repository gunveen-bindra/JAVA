class Rectangle{

		// Declaration of variables
		int length, width;				

		// Declaration of method
		void getData(int x, int y){
			length = x;
			width = y;
		}

		// Definition of another method
		int rectArea(){
			int area = length * width;
			return (area);
		}
	}

// class with main method
class prac4a_RectArea
{
	public static void main(String args[]){
		
		int area1, area2;

		// creating objects
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();

		// Accessing variables
		rect1.length = 15;
		rect1.width = 10;
		area1 = rect1.length * rect1.width;
		
		// Accessing methods
		rect2.getData(20, 12); 
		area2 = rect2.rectArea();

		System.out.println("Area of rectangle is  = " + area1);
		System.out.println("Area of rectangle is  = " + area2);

	}

}
