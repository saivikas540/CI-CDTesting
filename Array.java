package sai;

public class Array {

	public static void main(String[] args) {
		int[] num= {8,4,6,8,10,12};
		int target=14;
		int k= num.length;
		int tar;
		
	for(int i=0;i<k;i++) {
		for(int j=1;j<k;j++) {
		 tar= num[i]+num[j];
		 
		 if(tar==target) {
			 System.out.println(num[i]+" "+num[j]);
			 i=6;
			 j=6;
		 }
		
		}
		
	}
}
}
