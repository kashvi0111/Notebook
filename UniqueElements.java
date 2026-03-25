//import java.util.Scanner;
import java.util.*;
public class UniqueElements {
    static void UniqueElementsanyOrder(int [] arr){
        // in any order
        HashSet<Integer> set = new HashSet<> ();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        System.out.println("Unique Elements are (in any order):" + set);


    }
    // same order
    static void UniqueElemntssameorder(int[]arr){
         HashSet<Integer> set = new HashSet<> ();
         System.out.print("Unique Elements (same order): ");
         for (int i=0;i<arr.length;i++){
            if (!set.contains(arr[i])){
                set.add(arr[i]);
                System.out.print(arr[i]+" ");
            }
        }


    }
    

        


        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of Elements:");
        int n = sc.nextInt();
        int [] arr=new int [n];

        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        UniqueElementsanyOrder(arr);
        UniqueElemntssameorder(arr);
        sc.close();

        

    }
}
