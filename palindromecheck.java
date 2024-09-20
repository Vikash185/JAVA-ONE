public class palindromecheck {
    public static void main(String[] args) {
        String name = "dsa in java";
        String compare =" ";
        for(int i = name.length()-1;i>=0;i--){
            compare+=name.charAt(i);

    }
    if (name.equals(compare)){
        System.out.println("palindron");
    }
    else{
         System.out.println("not palindron");
    }

}
}
