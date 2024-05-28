import java.util.Scanner;
class NthFibonacciNumber
{
	public int fibonacciSeries(int num)
	{
		if(num <=1)
		{
		    return num;
		 }
		 
		 return fibonacciSeries(num -1) + fibonacciSeries(num -2);
	}
	
	public int oneFibi(int target)
	{
	      if(target <=1)
	             return target;
	             
	      return oneFibi(target -1) + oneFibi(target -2);
	 }

	public static void main(String s[])
	{
          NthFibonacciNumber obj = new NthFibonacciNumber();	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = sc.nextInt();
		
		for(int i = 0;i <= range;i++){
			System.out.print(obj.fibonacciSeries(i)+" ");
		}
		System.out.println("\nEnter the target position ");
		int target = sc.nextInt();
		int index = obj.oneFibi(target -1);
			System.out.println("Nth fibonacci number is : "+index);
		}
}
		
	
