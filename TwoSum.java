import java.util.*;
public class TwoSum {
    static void TwoSum(int[]arr,int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair found at indexes: [" + i + ", " + j + "]");
                    System.out.println("Elements: [" + arr[i] + ", " + arr[j] + "]");
                    return;
                }
            }


        }
        System.out.println("Pair not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int [] arr=new int[n];

        System .out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        
        TwoSum(arr,target);

        sc.close();


    }
}
