package sai;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int n=333;
		int r,sum=0,temp=n;
		
		while(n>0) {
			r=n%10; //3 //3.3 //3.33
			sum=(sum*10)+r; //3 //33.3
			n=n/10; //33.3 //3.33
		}
		
		if(temp==sum) {
			System.out.println("palin");
		}
		
		else {
			System.out.println("not");
		}
	}
}
