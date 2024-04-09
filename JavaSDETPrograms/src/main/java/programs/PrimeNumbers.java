package programs;

public class PrimeNumbers {

    public static void main(String[]args){
        int num=100, counter;

        for(int i=2;i<=num;i++){
            counter=0;
            for(int j=1;j<=num;j++){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter==2){
                System.out.print(i+ " ");
            }
        }
    }
}
