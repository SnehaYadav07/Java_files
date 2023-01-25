public class armstrongno {
    public static void main(String[] args) {

        int num=371,ans=0,rem=0;
        int temp=0;
        temp=num;
        while (temp!=0){
            rem=temp%10;
            ans+=Math.pow(rem,3);
            temp/=10;
        }
        System.out.println(ans);
        if (ans==num){
            System.out.println("given number is armstrong");
        }
        else{
            System.out.println("given number is not armstrong");
        }

    }
}
