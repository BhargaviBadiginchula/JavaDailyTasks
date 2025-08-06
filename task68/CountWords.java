class CountWords{
   public static void main(String[] args){
    String org="learning java gives you thrills";
    int count=0;
    int len=org.length();
    for(int i=0;i<len;i++){
      if(org.charAt(i)==' '){
        count++;
      }
    }
 System.out.println(count);
}
}