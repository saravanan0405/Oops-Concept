import java.util.*;
class BinnerySearch
{
	private int arr[];
	
	BinnerySearch(int arr[]){
	this.arr = arr;
 	}
 	
 	public int search(int target)
 	{
		int left = 0;
		int right = arr.length-1;
		while(left <= right){
		    int mid = left * (right + left)/2;
	            
	            if(arr[mid] == target)
	            {
	            	return mid;
	            }
	            
	            else if(arr[mid] > target)
	            {
	            	
	            	right = mid-1;
	            }
	            
	            else 
	             
	           	left = mid+1;
	           }
	           
	           return -1;
	 }	  		
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range");
	int range = sc.nextInt();
	System.out.println("Array elements are");
	int arr[] = new int[range];
	
	for(int i = 0;i<arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	
	// shorting
	
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1-i;j++)
		{
		    if(arr[j] > arr[j+1])
		    {
		    	int temp = arr[j];
		    	arr[j] = arr[j+1];
		    	arr[j+1] = temp;
		    }
		 }
       }
       System.out.println("Enter target");
       int target = sc.nextInt();
       
       BinnerySearch obj = new BinnerySearch(arr);
       int searchValue = obj.search(target);
       
       if(searchValue == -1)
       {
       	System.out.println("Element not found");
       }
       else
       System.out.println("Element found");
     }
}
