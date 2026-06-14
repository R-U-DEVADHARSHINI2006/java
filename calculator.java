package r;

public class Calculator {
	    void add(int a, int b) {
	        int result = a + b;
	        System.out.println("Addition = " + result);
	    }

	    
	    void subtract(int a, int b) {
	        int result = a - b;
	        System.out.println("Subtraction = " + result);
	    }

	  
	    void multiply(int a, int b) {
	        int result = a * b;
	        System.out.println("Multiplication = " + result);
	    }

	   
	    void divide(int a, int b) {
	        if (b == 0) {
	            System.out.println("Division not possible (cannot divide by zero)");
	        } else {
	            int result = a / b;
	            System.out.println("Division = " + result);
	        }
	    }
	}
------------------------------------------------------------------------------------------------------------------------------------------------------------
  package r;

public class cal {
	
	    public static void main(String[] args) {

	        // Creating object of Calculator class
	        Calculator calc = new Calculator();

	        // Calling methods using object and passing values
	        calc.add(20, 10);
	        calc.subtract(20, 10);
	        calc.multiply(20, 10);
	        calc.divide(20, 10);
	    }
	}

