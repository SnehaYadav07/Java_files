import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=100;
        int first_term=0;
        int second_term=1;

        while(first_term<=num){
            System.out.print(first_term+",");
            int next_term=first_term+second_term;
            first_term=second_term;
            second_term=next_term;
        }
    }
}
