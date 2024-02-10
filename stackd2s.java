import java.util.Stack;
import java.util.Scanner;
//min stack using stuff
public class stackd2s {
    public static void main(String[] args) {
        Stack<Integer> slow = new Stack<Integer>();
        Scanner snow = new Scanner(System.in);
        System.out.println("enter element to push");
        int item = snow.nextInt();

        if (slow.isEmpty()){
            slow.push(item);
        }
        else{
            int i = slow.peek();
            if(i<item){
                slow.pop();
                slow.push(item);
                slow.push(i);
            }
        }
    }
}

//remove stars from given strings using stack