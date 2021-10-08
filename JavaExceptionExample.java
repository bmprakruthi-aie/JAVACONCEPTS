// Example for both exception handling and try catch block

public class JavaExceptionExample {
	 public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int a = 100/0;  // Arithmetic exception
		   }catch(ArithmeticException e){System.out.println(e);}  
		   //rest code of the program   
		   System.out.println("rest of the code...");  
		  }
}