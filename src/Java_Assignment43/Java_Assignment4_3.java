package Java_Assignment43;
/*
 * This class will help to master the concepts: Inheritance, Final keyword
 */
public class Java_Assignment4_3 {


	public static void main(String[] args) 
	{
				
		StudentData obj=new  StudentData(1234);  // initializing  StudentData instance
		obj.myMethod(); // calling myMethod method
	      
		ABC ob=new ABC(); // initializing  ABC instance
		ob.demo(); // calling demo method
		ob.demoABC(); // calling demoABC method

	}

}

class StudentData //class containing final variable
{  
   //final variable
   final int ROLL_NO;
	 
   StudentData(int rnum)
   {
      //final variable must be initialized in constructor
      ROLL_NO=rnum;
      
   }
   void myMethod()// method to print the value of roll number 
   {  
      System.out.println("Final Variable Rollno value is:"+ ROLL_NO);
   }  
}

class XYZ // Class for containing final method
{  
	   //final method cannot over ride but can be inherited
	   final void demo() //final method
	   {
	      System.out.println("\ndemo final Method in XYZ Class");
	   }  
}  

final class ABC extends XYZ // final class
{  
	void demoABC()
	   {
	      System.out.println("\ndemoABC Method in ABC final Class ");
	      System.out.println("\nNo constructor can be declared as Final in Java");
	   }  
}  

