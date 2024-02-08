import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayprint {
    public static void main(String[] args) {
        Scanner soda = new Scanner(System.in);
        ArrayList school = new ArrayList();
        System.out.println("enter the values here");
        school.add(soda.nextInt());
        school.add(soda.nextLong());
        school.add(soda.nextFloat());
            System.out.println("the phone number is :");
            System.out.println(school.get(1));
        }
    }


