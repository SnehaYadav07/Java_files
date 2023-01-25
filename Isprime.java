import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        int num1;
        Scanner in=new Scanner(System.in);
        num1=in.nextInt();
        int count=0;
        if(num1<=1){
            System.out.println("is not prime");
            return;
        }
        for (int i=1;i<num1;i++){
            if (num1%i==0){
                count++;
            }
        }
        if(count>1){
            System.out.println("is not prime");
        }else {
            System.out.println("is prime");
        }

    }
}
