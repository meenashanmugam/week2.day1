package week2.day1;

public class CharOccurance {
public static void main(String arg[])
{
	String str = "welcome to chennai";
int count=0;
char[] charArray = str.toCharArray();
str.length();
for(int i=0; i<str.length(); i++)
{
	if(charArray[i]=='e')
	{
		count++;
	}
}
System.out.println(count);

}
}
