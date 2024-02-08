import java.util.Scanner;
public class sumofoddindices {


    public static boolean isDuplicated(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i])
                count++;
        }
        if (count > 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner snow = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = snow.nextInt();
        }
        int key;
        System.out.println("enter the key");
        key = snow.nextInt();

        System.out.println(isDuplicated(arr, key));
    }
}
