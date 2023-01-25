import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int rev=0;
        int num;
        num=in.nextInt();
        while(num!=0){
            rev=rev*10;
            rev=rev+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
