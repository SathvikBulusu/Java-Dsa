import java.util.Arrays;
import java.util.Scanner;

public class ben_stokes {
    public static void main(String[] args) {
        int[] vio = new int[6];
        Scanner hi = new Scanner(System.in);
        System.out.println("enter the array");
        for (int i = 1; i < vio.length; i++) {
           for(int j = 1;;j++){
            vio[i] = hi.nextInt();
            if (vio[i] != vio[i - 1]) {
                vio[j] = vio[i];}
                System.out.println(Arrays.toString(vio));
                System.out.println(j);

        }
    }
}
}
