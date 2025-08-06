import java.util.Scanner;
class CharOpsInEmail{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your email:- ");
    String mail=sc.nextLine();
    int vowelCount=0;int consonantCount=0;
    int sum=0;int oddCount=0;int specialCount=0;
    sc.close();
    for(int i=0;i<mail.length();i++){
        char c=mail.charAt(i);
        if(c>=65 && c<=91 ||c>=97 &&c<=123){
            char f=Character.toLowerCase(c);
            if(f=='a'||f=='e'||f=='i'||f=='o'||f=='u'){
                vowelCount++;
            }else{
                consonantCount++;
            }
        }
        //else if(c>=48 && c<=57){
        else if(Character.isDigit(c)) {
            int d=c-'0';
            if(d%2==0){
                sum+=d; 
            }
            else{
                
                oddCount++;
            }
        }
        else{
        specialCount++;
        }
              
    }System.out.println("Vowel character count:- "+vowelCount);
    System.out.println("Consonant character count:- "+consonantCount);
    System.out.println("even character sum:- "+sum);
    System.out.println("odd  digit character count:- "+oddCount);
    System.out.println("Special character count:- "+specialCount);
   }
}