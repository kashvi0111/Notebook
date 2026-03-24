//import java.util.Scanner;
import java.util.*;
public class UniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of Elements:");
        int n = sc.nextInt();
        int [] arr=new int [n];

        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // in any order
        HashSet<Integer> set = new HashSet<> ();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        System.out.println("Unique Elements are (in any order):" + set);

        // in same order 
        LinkedHashSet<Integer> orderedset = new LinkedHashSet<>(); 
        for (int i=0;i<arr.length;i++){
            orderedset.add(arr[i]);
        }
        System.out.println("Unique Elements are (in orederd form) :" + orderedset);

        sc.close();

    }
}
