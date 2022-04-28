package week2.day1;

public class StringLearn {
	
public static void main(String args[])
{
	int count=0;
	String text="Testleaf is situated in twin towers teynampet";
	String text2="testleaf";
	char[] charArray = text2.toCharArray();
	for(int i=0; i<text2.length(); i++)
	{
	if(charArray[i]=='e')
	{
	count++;
	}
	}
	System.out.println(count);
	boolean startsWith = text.startsWith("t");
System.out.println(startsWith);
}
}
