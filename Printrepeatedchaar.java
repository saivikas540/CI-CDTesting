package sai;

public class Printrepeatedchaar {

	public static void main(String[] args) {
	String wrd="saivikas";
	char[] wrddup=wrd.toCharArray();
	int count;
	for(int i=0;i<=wrddup.length;i++) {
	 count=1;
		for(int j=i+1;j<wrddup.length;j++) {
			if((wrddup[i]==wrddup[j])&&wrddup[i] !=' ')
			{
				count++;
				wrddup[j]='0';
			}
		}
		
		if(count>1&&wrddup[i]!='0') {
			System.out.print(wrddup[i]);
		}
	}
		
	}
//	  public static void main(String[] args) {  
//	        String string1 = "Great responsibility";  
//	        int count;  
//	        char string[] = string1.toCharArray();  
//	           
//	        for(int i = 0; i <string.length; i++) {  
//	            count = 1;  
//	            for(int j = i+1; j <string.length; j++) {  
//	                if(string[i] == string[j] && string[i] != ' ') {  
//	                    count++;  
//	                    //Set string[j] to 0 to avoid printing visited character  
//	                    string[j] = '0';  
//	                }  
//	            }  
//	            //A character is considered as duplicate if count is greater than 1  
//	            if(count > 1 && string[i] != '0')  
//	                System.out.println(string[i]);  
//	        }  
//	    }  
}
