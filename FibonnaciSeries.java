package sai;

public class FibonnaciSeries {
	
//	public void fibo(int n) {
//		int a=0,b=1,c;
//		
//		{
//			for(int i=2;i<=n;i++) {
//				System.out.print(a+" ");
//				c=a+b;
//				a=b;
//				b=c;
//			}
//			
//			System.out.println("/n"+b);
//		}
//	}
//	
//	public static void main(String[] args) {
//		FibonnaciSeries fib=new FibonnaciSeries();
//		fib.fibo(9);
//	}

	  public static int fibonacci(int count) {
			if (count <= 1)
				return count;

			return fibonacci(count - 1) + fibonacci(count - 2);
		}

		public static void main(String args[]) {
	    	int seqLength = 10;

	    	System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");

	    	for (int i = 0; i < seqLength; i++) {
	      	    System.out.print(fibonacci(i) + " ");
	    	}
	  	}

	}

