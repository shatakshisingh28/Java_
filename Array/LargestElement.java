import java.util.*;

class LargestElement {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            } else {
                continue;
            }
        }
        System.out.println(max);
        sc.close();
    }
}