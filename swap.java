public class swap {
    public static void main(String[] args) {
        int x=6;
        int y=9;
        swap(x,y);

    }
    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
