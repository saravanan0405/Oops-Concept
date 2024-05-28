import java.util.Scanner;
class Palindrome
{
	String name;
	
	Palindrome(String name)
	{
		this.name = name;
	}
	
	public void palindromeCheck(String name)
	{
		int index;
		int length = name.length();
		
		for(index =0;index<length/2;index++)
		{
			if(name.charAt(index)!= name.charAt(length-index -1))
			{
				System.out.println(name+" is not a palindrome");
				break;
			}
			
			if(index == (length/2)-1)
			{
				System.out.println(name+" is a palindrome ");
			}
		}
	}
			 
		
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			String name = sc.next();
			
			Palindrome obj = new Palindrome(name);
			
			obj.palindromeCheck(name);
	}
}
	
