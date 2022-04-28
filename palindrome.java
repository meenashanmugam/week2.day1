package week2.day1;

public class palindrome {
	public static void main(String arg[]) {
		 String a="madam";
		 String rev="";
		 char[] charArray = a.toCharArray();
		 for(int i=charArray.length-1; i>=0; i--)
		 {
			rev=rev+charArray[i];

		 }
		 
	 if(a.equals(rev))
	 {
		
		System.out.println("string is palindrome");
	}
	 else
	 {
		 System.out.println("string is not palindrome");
	 }
}
}
