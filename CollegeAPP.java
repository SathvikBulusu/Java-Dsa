import java.util.Scanner;

public class CollegeAPP {
    static int rno;
    static String cname;
    static String subs;

    public static void main(String[] args){
        System.out.println("Enter the branch name ");
        Scanner hi = new Scanner(System.in);
        CollegeAPP.subs=hi.next();
        if (CollegeAPP.subs.equals("cse")) {
                CollegeAPP.subs = "5 subjects allocated";
                int math = 55;
                int scinece = 34;
                int english = 67;
                int data = 57;
                int social = 78;
                int pecentage = social+data+math+scinece+english % 100;
                System.out.println("the % is "+pecentage);
                CollegeAPP.cname = "Cmr college of engineeing and technology";
                CollegeAPP.rno=6701;
            System.out.println("the % is "+pecentage + CollegeAPP.cname+CollegeAPP.rno);
            }
        else if (CollegeAPP.subs.equals("ece")) {
            CollegeAPP.subs = "3 subjects allocated";
            int math = 55;
            int scinece = 34;
            int english = 67;
            int pecentage = math + scinece + english % 100;
            CollegeAPP.rno=6702;
            CollegeAPP.cname="iit delhi";
            System.out.println("the % is "+pecentage + "  & the college name is "+CollegeAPP.cname+" & no being "+CollegeAPP.rno);
            }
        else
        {
            System.out.println("please enter correct branch name");
        }

    }
}

