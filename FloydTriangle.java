import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int c;
        Scanner in =new Scanner(System.in);
        c=in.nextInt();
        int d=c;
        for(c=0;c<=d;c++){
            for(d=c;d<=c;d++){
                System.out.println("*");
            }
            System.out.println(" ");
        }
    }
}
