import java.util.Scanner;
public class checkingeven {
    public static void main(String[] args) {
        int sumo[] = new int[5];
        Scanner snow = new Scanner(System.in);
        System.out.println("enter the elements ");
        for (int i = 0; i < sumo.length; i++) {
            sumo[i] = snow.nextInt();
        }
        for (int i=0;sumo[i] % 2 ==0 ; i++) {
            System.out.println("its even");
        }
        for (int i = 0;sumo[i] % 2 !=0 ;i++){
            System.out.println("its odd");
        }
    }
}
