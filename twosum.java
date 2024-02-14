import java.util.Scanner;

public class twosum {

    public static int[] sum(int[] num, int target) {
        // Existing code for finding the two sum
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        // Add Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        int[] result = sum(num, target);

        if (result.length == 0) {
            System.out.println("No solution found");
        } else {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
        }
    }
}