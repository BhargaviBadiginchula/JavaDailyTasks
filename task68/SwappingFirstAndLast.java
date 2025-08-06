import java.util.Arrays;
class SwappinFirstAndLast{
   public static void main(String[] args){
     int []arr={1,2,3,4,5,6,7,8};
     System.out.println("original array:- ");
     System.out.println(Arrays.toString(arr));
     int temp=arr[0];
     arr[0]=arr[arr.length-1];
     arr[arr.length-1]=temp;
     System.out.println("After swap1 using temp array:- ");

     System.out.println(Arrays.toString(arr));
   
     arr[0]=arr[0]+arr[arr.length-1];
     arr[arr.length-1]=arr[0]-arr[arr.length-1];
     arr[0]=arr[0]-arr[arr.length-1];
     System.out.println("After swapping without third variable array:- ");

     for(int a:arr){
       System.out.print(a+" ");
     }
  }
}