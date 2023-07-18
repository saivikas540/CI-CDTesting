package sai;

public class swapTwoNumWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a=10,b=200;

		a=a+b; //a=210
		b=a-b; //b=10
		a=a-b;// a=200
		
		System.out.println(a+" "+b);
	}
}
