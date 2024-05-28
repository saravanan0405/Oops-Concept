import java.util.Scanner;
class Fibonacci
{       
    
   public int  fibonacciSeries(int num){
    	    
    	  if(num <= 1)
    	  {
    	     return num;
    	   }
    	   
    	   return fibonacciSeries(num -1) + fibonacciSeries(num -2);
   }
   
    	    	public static void main(String s[])
	     {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int range = sc.nextInt();
		
		Fibonacci obj = new Fibonacci();
		
		for(int i=0;i<=range;i++)
		{
			System.out.println(obj.fibonacciSeries(i)+" ");
		}
   }

}
