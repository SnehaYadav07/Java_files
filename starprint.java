import java.util.Scanner;

public class starprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int i;
        int j;
        for (i =0;i<=c;i++){
            for (j=0;j<=r;j++) {
                if (i == 2 || i == 3 || j == 3 || j == 2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
