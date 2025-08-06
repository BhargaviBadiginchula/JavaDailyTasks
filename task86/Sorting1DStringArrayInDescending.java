import java.util.*;
public class Sorting1DStringArrayInDescending {
    public static void main(String[] args){
        String []str=new String[5];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<5;i++){
          str[i]=sc.next().toLowerCase();
        }
        String b[]={"Bhavesh","Shiv","Rudra","Mahakal","Bholenath","Shankar"};
        Arrays.sort(b);
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(b));
        sc.close();
        
        
    }
}
