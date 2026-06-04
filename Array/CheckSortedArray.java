import java.util.*;
class Solutions {
    public boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) 
                return false;
        }
        return true;  
    }
}

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solutions obj = new Solutions();
        System.out.println(obj.isSorted(arr, n) ? "True" : "False");
        sc.close();
    }
}