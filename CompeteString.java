import java.util.Scanner;

public class CompeteString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1,s2;
        s1=in.nextLine();
        s2= in.next();
        int cpp=s1.compareTo(s2);
        System.out.println(cpp);

        if(s1.compareTo(s2)>0){
            System.out.println(s2+"  is large in length");
        } else if (s1.compareTo(s2)<0) {
            System.out.println(s1+"  is large in length");
        }
        else {
            System.out.println("both are same");
        }

    }
}
