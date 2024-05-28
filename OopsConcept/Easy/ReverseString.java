import java.util.Scanner;
class ReverseString
{
	private String name;
	
	ReverseString(String name)
	{
		this.name = name;
	}
	
	public void reverse(String name)
	{
		String rev = "";
		
		for(int i =name.length()-1;i>=0;i--)
		{
			rev = rev+name.charAt(i);
		}
		System.out.println("Revers the String : "+rev);
	}
	
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the String ");
		     String name = sc.next();
		     
		     ReverseString obj = new ReverseString(name);
		     
		     obj.reverse(name);
	}
}	
