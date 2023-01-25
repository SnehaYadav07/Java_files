import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int c,fact=1;
        c=in.nextInt();
        for (int i=1;i<=c;i++){
            fact=fact*i;

        }  System.out.println(fact);

    }
}
