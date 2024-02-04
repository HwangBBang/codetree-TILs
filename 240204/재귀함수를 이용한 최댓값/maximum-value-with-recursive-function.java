import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ns = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(s -> Integer.parseInt(s)).toArray();

        System.out.println(recFindMax(ns, n));
    }

    private static int recFindMax(int[] nums, int n) {
        if (1 == n) return nums[0];

        return (nums[n-1] < recFindMax(nums, n-1)) ?
         recFindMax(nums, n-1) : nums[n - 1]; 
        
    }

}