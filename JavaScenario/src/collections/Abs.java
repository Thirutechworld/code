package collections;

public  abstract class Abs {
	
	
	abstract void calculate(int a, int b);
	
	public class Addition extends Abs
	{ 
	  void calculate(int a, int b)
	  { 
	    int x = a + b; 
	    System.out.println("sum:" +x); 
	   } 
	} 
	public class Subtraction extends Abs 
	{ 
	  void calculate(int a, int b)
	  { 
	    int y = a - b; 
	    System.out.println("Subtract: " +y); 
	  } 
	} 
	public class Multiplication extends Abs
	{ 
	  void calculate(int a, int b)
	  { 
	    int z = a * b; 
	    System.out.println("Multiply: " +z); 
	  } 
	} 
	
	 public static  void main(String[] args) 
	 { 
	   Addition a = new Addition(); 
	   Subtraction s = new Subtraction(); 
	   Multiplication m = new Multiplication(); 
	    
	    a.calculate(20, 30); 
	    s.calculate(10, 5); 
	    m.calculate(10, 20); 
	  } 
	
}
