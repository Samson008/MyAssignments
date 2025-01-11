package week1.day2;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		int n = 8;
		int a = 0;
		int b = 1;
		System.out.println("The Fibonacci Series are");
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++) {
		   int c = a+b;
		   System.out.println(c);
		   a=b;
		   b=c;
		   
		} 
		
	}

}
