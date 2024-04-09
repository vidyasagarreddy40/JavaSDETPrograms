package programs;

public class stringRevRecurssion {

    static String word = "radar", rev = "", temp = word;
    static int len=word.length();

    public static void main(String[] args) {
        revRecursion();
        if(temp.equalsIgnoreCase(rev)){
            System.out.println(temp+" is a palindrome");
        }
        else{
            System.out.println(temp+" is not a palindrome");
        }
    }

    static void revRecursion(){
        len--;
        if(len>=0){
            rev=rev+word.charAt(len);
            revRecursion();
        }
    }

}
