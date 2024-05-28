import java.util.Scanner;
class FindMax
{
	private int arr[];
	
        FindMax(int arr[]){
        this.arr = arr;
        }
        
        public int maxValue(){
          int max = Integer.MIN_VALUE;
          for(int i =0;i<arr.length;i++)
          {
          	if(arr[i] > max){
          	   max = arr[i];
                 }
                
           }
           return max;
         }
         
         public static void main(String args[])
         {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the range");
               int range = sc.nextInt();
               
               if(range >=0){ 
                   System.out.println("enter valid range");
                   return;
                  }
                  
            System.out.println("Array elements are");
               int arr[] = new int[range];
            
            for(int i =0;i<arr.length;i++)
            {
                 arr[i] = sc.nextInt();
             }
            
         	FindMax max = new FindMax(arr);
         	
         	int LargeNumber =max.maxValue();
         	System.out.println("Max value = "+LargeNumber);
         }
   }
