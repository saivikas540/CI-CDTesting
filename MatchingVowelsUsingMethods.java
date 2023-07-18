package sai;

public class MatchingVowelsUsingMethods {
	
	public static void vowels(String inn) {
		boolean k=inn.toLowerCase().matches("(.*)[aeiou](.*)");
		if(k==true) {
		System.out.println("vowel");
		}
		
	}
	public static void main(String[] args) {
		String val="rrrre";
		vowels(val);
	
		
	}

}
