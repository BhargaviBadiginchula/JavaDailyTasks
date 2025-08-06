class Printing1TO100WithOutNumerics{
   public static void main(String[] args){
   char a='\u0001';
    System.out.println("Numbers in the range of 1 to 100:");
    while(a<='d'){
    System.out.print((int)a+" ");
    a++;
    }

    
  }
}