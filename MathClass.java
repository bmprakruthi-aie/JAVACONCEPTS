
public class MathClass {
	public static void main(String[] args) {
		
		  System.out.println(Math.PI);
	      System.out.println(Math.E);
	       
	      System.out.println(Math.pow(2, 3)); 

	      System.out.println(Math.exp(1));
	      System.out.println(Math.expm1(1));

	      System.out.println(Math.log(11));
	      System.out.println(Math.log10(10));
	      System.out.println(Math.log1p(10));
   
	   // using ceil,floor, round functions
	      System.out.println(Math.ceil(5.5));
	      System.out.println(Math.floor(5.5));
	      System.out.println(Math.rint(5.5));
	      System.out.println(Math.round(5.5));
	       
	  // using absolute, maximum and minimum  
	      int a = 10, b = -20;
	      System.out.println(Math.abs(a)); // 10
	      System.out.println(Math.abs(b)); // 20
	      System.out.println(Math.max(a, b)); // 10
	      System.out.println(Math.min(a, b)); // -20
	      System.out.println(Math.abs(a)); // 10
	      System.out.println(Math.abs(b)); // 20
	      System.out.println(Math.max(a, b)); // 10
	      System.out.println(Math.min(a, b)); // -20
	      System.out.println(Math.sqrt(64));
	      System.out.println(Math.cbrt(64));
	   }
}
