class Fact{
   public int fact(int n){
     
     if (n==0){
        return 1;
     }
       return n*fact(n-1);
     }
}
class NonRecursion{
   public int fact(int n){
      if (n==0){
        return 1;
     }
     int res=1;
     while(n>0){
     res*=n;
     n--;
     }
   return res;
}
}

public class FactorialUsingRecursionAndNonRecursion

{
 public static void main(String[] args){
      Fact v=new Fact();
      NonRecursion b=new NonRecursion();

      System.out.println(v.fact(5));
      System.out.println(b.fact(4));

   }
}
     
