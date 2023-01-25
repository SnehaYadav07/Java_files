public class sum_arr {
    public static void main(String[] args) {
        int sum=1;
        int[][] num1 = {{2,3,2}, {7,8,9},{9,8,9}};
        int[][] num2 = {{2,3,2}, {7,8,9},{9,8,9}};
        for (int i=0;i<=num1.length;i++){
            for (int j=0;j<= num2.length;j++){
                sum=i&j;
                System.out.println(sum);
            }
        }
    }
}
