import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
       int[] nums={8,2,9,10,17,98,21,78};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to find : ");
       int target=sc.nextInt();
       int n= nums.length;
      int index= linearsearch(nums,target,n);
      if(index== -1)
        System.out.print("Elemnt not found");
      else
          System.out.println("elment's index place is "+index);
    }

    static int linearsearch(int nums[],int target,int n){
        if(nums.length==0)
            return 0;

        for (int i=0;i<=nums.length;i++){
            if(nums[i]==target)
                return i;
        }

        return -1;
    }
}
