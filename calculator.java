import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        calculate();
        calculate();
    }
    static void calculate(){
        int num1;
        int num2;
        char op;
        System.out.println("******--WELCOME TO CALCULATOR--******");
        Scanner in = new Scanner(System.in);
        System.out.print("enter num1 : ");
        num1 = in.nextInt();
        System.out.print("enter operator : ");
        op = in.next().charAt(0);
        System.out.print("enter num2 : ");
        num2 = in.nextInt();

        if(op == '+'){
            System.out.println(num1+num2);
        }
        else if(op == '-'){
            System.out.println(num1-num2);
        }

        else if(op == '*'){
            System.out.println(num1*num2);
        }

        else if(op == '/'){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("enter valid operator");
        }
    }
}
