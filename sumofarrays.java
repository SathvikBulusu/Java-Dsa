import java.util.Scanner;

public class sumofarrays {
    public static void main(String[] args) {
        int sumo[] = new int[5];
        int sum =0;
        Scanner snow = new Scanner(System.in);
        System.out.println("enter the elements ");
        for (int i =0 ; i <sumo.length;i++){
            sumo[i] = snow.nextInt();
            sum = sum+sumo[i];
        }

        if(sum%2 == 0){
            System.out.println("its even");
        }
        else{
            System.out.println("its odd");
        }

    }
}
