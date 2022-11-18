package section2;

public class StringClass {
	public static void main(String[] args) {
	String star="Java Program";
	StringBuilder sb=new StringBuilder("Java Program");
	String immutable_substring = star.substring(2,5);
	int immutable_length = star.length();
	System.out.println("Immutable Substring:"+ immutable_substring);
	System.out.println("Immutable length:"+ immutable_length);
	System.out.println("Mutable length:"+sb.length());
	System.out.println("Mutable Substring:"+ sb.substring(2,5));
	
}}