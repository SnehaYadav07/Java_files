public class Pallindrome {
    public static void main(String[] args) {
        String s="abA +";
        s=s.toLowerCase();
        String rev="";
        int n=s.length();
        for (int i=n-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        System.out.println(rev);
        if (s.equals(rev)){
            System.out.println("is pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
}
