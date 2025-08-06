import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number ");
    int n=sc.nextInt();
    int first=0;int next=1;
    for(int i=1;i<n;i++){
        int temp=first+next;
        System.out.print(first+" ");
        first=next;
        next=temp;
    
    }sc.close();
}
}
