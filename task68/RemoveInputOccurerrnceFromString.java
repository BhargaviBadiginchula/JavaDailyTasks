import java.util.Scanner;
class RemoveInputOccurerrnceFromString{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a occurence to remove");
     char inp=sc.next().charAt(0);
     String org="I love to code because code helps me solve problems. Writing code every day improves my coding skills.";
     System.out.println("original String:- "+org);
     String res=org.replace(String.valueOf(inp),"");
     System.out.println("after removing "+inp+" :-"+res);
  }
}