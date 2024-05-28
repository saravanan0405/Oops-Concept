import java.util.Scanner;
class Factorial
{
	private int first;
	private long factorial; 
	
	Factorial(int first)
	{
		this.first = first;
		long factorial = factorialCheck(first);
	        setFactorial(factorial);	
	}
	
	private long factorialCheck(int first)
	{
		if(first == 1)
		{
			return first;
		}
			return first * factorialCheck(first -1);
	}
	
	public void setFactorial(long factorial)
	{
		this.factorial = factorial;
	    }
	
	public long getFactorial()
	{
		return factorial;
	   }
	
	
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int first = sc.nextInt();
		
		Factorial fact = new Factorial(first);

		System.out.println(fact.getFactorial());
	}
}
