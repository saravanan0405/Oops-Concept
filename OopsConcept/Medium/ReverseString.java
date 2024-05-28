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
		
		for(int i =0;i<name.length();i++)
		{
			rev = rev+name.charAt(i);
		}
		System.out.println("Revers the String : "+rev);
	}
	
	public static void main(String s[])
	{
		Scanner sc = new SCaner(System.in);
		     System.out.println("Enter the String ");
		     String name = sc.next;
		     
		     ReverseString obj = new ReverseString(name);
		     
		     obj.reverse(name);
	}
}	
