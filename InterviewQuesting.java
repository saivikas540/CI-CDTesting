package sai;

public class InterviewQuesting {

	public static void main(String[] args) {
	int[] num= {1,3,4,5};
	int[] num1= {3,4,5,2};
	int len=num.length;
	int k=9;
	
	for(int i=0;i<len;i++) {
		for(int j=1;j<len;j++) {
			int number=num[i]+num[j];
					if(number==k) {
						System.out.println(num[i]+" "+num[j]);
					}
		}
	}
	}
}
