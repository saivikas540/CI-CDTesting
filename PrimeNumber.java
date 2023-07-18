package sai;

public class PrimeNumber {

	public void primeNumber(int n) {
//n=4	
		int flag=0;	
		if(n==0||n==1) {
			System.out.println("prime");
		}
		
		for(int i=2;i<=n/2;i++) {
			if (n%i==0) {
				
				System.out.println("not prime");
				flag=1;
			    break;	
			}
		}
		if(flag==0) {
			System.out.println("prime num");
		}
	}
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.primeNumber(2);
	}
}
