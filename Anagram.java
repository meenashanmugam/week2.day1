package week2.day1;

import java.util.Arrays;

public class Anagram {
 public static void  main(String arg[]) {
	 String text1 = "stops";
	 String text2 = "potss";
	 text1.length();
	 text2.length();
	 char[] charArray = text1.toCharArray();
	 char[] charArray2 = text2.toCharArray();
	 Arrays.sort(charArray);
	 Arrays.sort(charArray2);
 //System.out.println(Arrays.sort(charArray));
	// System.out.println(Arrays.sort(charArray2));
if(Arrays.equals(charArray,charArray2))
{
	
System.out.println("this is Anagram");

 }
else
{
	System.out.println("this is not Anagram");
}
}
}
