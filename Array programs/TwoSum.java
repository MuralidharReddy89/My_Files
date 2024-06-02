import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        int[] result = twoSum(num, target);
        if (result.length == 2) {
            System.out.println("Indices of the two numbers that sum up to the target: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
