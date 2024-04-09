package programs;

public class NumberReverseRecurssion {
    static int num = 151, temp = num, rev = 0;

    public static void main(String[] args) {

        revRecurssion();
        if(rev==temp){
            System.out.println(temp+ " is a number palindrome");
        }else{
            System.out.println(temp+" is not a number palindrome");
        }
    }

    static void revRecurssion(){
        if(num!=0){
            rev=(rev*10)+(num%10);
            num=num/10;
            revRecurssion();
        }
    }
}
