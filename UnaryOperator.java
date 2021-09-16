
public class UnaryOperator {

	public static void main(String[] args) {
	// ++ and -- (example1)
		int x=10;  
		System.out.println(x++);//10  
		System.out.println(++x);//12  
		System.out.println(x--);//12 
		System.out.println(--x);//10
		
	// ++ and -- (example2)
		int a=10;  
		int b=10;  
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21  
		  
	// ~ and ! (example 3) 
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
		
	}

}
