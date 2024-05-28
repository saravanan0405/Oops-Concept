//Create a method called "calculateAverage" that takes an array of integers as an argument and returns the average of the numbers in the array

import java.util.*;

class CalculateAvg{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array length");
        int range = sc.nextInt();
        System.out.println("Enter array elemenets");
        int arr[] = new int[range];
        for(int i =0;i<arr.length;i++){
        System.out.println("Enter element"+(i+1));
	      arr[i] = sc.nextInt();
	}
	
	System.out.println("Avg value of array="+findAvg(arr));
   }
  
   public static  int findAvg(int arr[]){
     int n = arr.length;
 
     int sum = 0;
     for(int i =0;i<arr.length;i++){
        sum =sum+arr[i];
        }
        
        int avg = sum / n;
        return avg;
      
   }
}
	 
