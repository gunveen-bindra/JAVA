class Operators
{
 public static void main(String args[])
{
TypesOperators obj = new TypesOperators();
obj.ArithmeticOperator();
obj.AssignmentOperator();
obj.UnaryOperator();
obj.LogicalOperator();
obj.Relational();
obj.ConditionalOperator();
}
}

class TypesOperators {
	void ArithmeticOperator() {
    	
        double number1 = 12.5, number2 = 3.5, result;
    	System.out.println("Arithmetic Operator");
        // Using addition operator
        result = number1 + number2;
        System.out.println("number1 + number2 = " + result);
    	
        // Using subtraction operator
        result = number1 - number2;
        System.out.println("number1 - number2 = " + result);
    	
        // Using multiplication operator
        result = number1 * number2;
        System.out.println("number1 * number2 = " + result);

        // Using division operator
        result = number1 / number2;
        System.out.println("number1 / number2 = " + result);
    	
        // Using remainder operator
        result = number1 % number2;
        System.out.println("number1 % number2 = " + result);
    }


	void AssignmentOperator() {
	
	System.out.println("\nAssignment Operator\n");
	
	int number1, number2;
	// Assigning 5 to number1
		number1 = 5;
	System.out.println(number1);            
	// Assigning value of variable number2 to number1
	number2 = number1;
	System.out.println(number2);
	}
 
	void UnaryOperator() {
	
	double number = 5.2, resultNumber;
	boolean flag = false;

	System.out.println("\nUnary Operator\n");

	System.out.println("+number = " + +number);
	// number is equal to 5.2 here.

	System.out.println("-number = " + -number);
	// number is equal to 5.2 here.

	// ++number is equivalent to number = number + 1
	System.out.println("number = " + ++number);
	// number is equal to 6.2 here.

	// -- number is equivalent to number = number - 1
	System.out.println("number = " + --number);
	// number is equal to 5.2 here.

	System.out.println("!flag = " + !flag);
	// flag is still false.
     }

	void LogicalOperator() {

	System.out.println("\nLogical Operator\n");
        int number1 = 1, number2 = 2, number3 = 9;
        boolean result;
    	
        // At least one expression needs to be true for the result to be true
        result = (number1 > number2) || (number3 > number1);

       
	// result will be true because (number3 > number1) is true
        System.out.println(result);
    			
        // All expression must be true from result to be true	
        result = (number1 > number2) && (number3 > number1);

	// result will be false because (number1 > number2) is false
        System.out.println(result);
     }

	void Relational() {
	
	System.out.println("\nRelational Operator\n");
	int a = 10;
	int b = 20;

	System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
     }

	//Ternary Operator
	void ConditionalOperator()
	{
	
	System.out.println("\nTernary Operator\n");
	int februaryDays = 29;
	String result;
	result =  (februaryDays == 28) ? "Not a leap year" : "Leap year";
	System.out.println(result);
     }
}
