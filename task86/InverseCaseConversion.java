import java.util.Arrays;
public class InverseCaseConversion {
    public static void main(String[] args){
        String name="bhaRgaVI BadiGINchula";
        
        char[] ch=name.toCharArray();
        char[] newStr=new char[name.length()];
        for(int i=0;i<ch.length;i++){
            char a=ch[i];
            if(Character.isLowerCase(a)){
                newStr[i]=Character.toUpperCase(a);
            }
            else{
                newStr[i]=Character.toLowerCase(a);
            }


        }System.out.println("Original String:- ");
        System.out.println(name);
        System.out.println("After case Inversion:- ");
        System.out.println(String.valueOf(newStr));

    }
}

