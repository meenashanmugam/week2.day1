package week2.day1;

public class ReverseEvenWords {
	public static void main(String arg[])
	{
		String test = "I am a software tester";
		String output=" ";
		String rev=" ";
		
		String[] sp = test.split(" ");
		for(int i=0; i<sp.length; i++)
		{
			if((i+1)%2==0)
			{
				char[] charArray = sp[i].toCharArray();
				for(int j=charArray.length-1; j>=0;j--)
				{
					
					
					rev=rev+charArray[j];
				}
				output=output+rev+" ";
			}
			else
			{
				output=output+sp[i]+" ";
			}
		}
		System.out.println(output);
	}

}
