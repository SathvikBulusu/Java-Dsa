public class method_ov_or {
    void baka (int a , int b){

        System.out.println(a+b);
    }

    void baka(int a , int b,int c){

        System.out.println((a+b)*c);
    }
}

class ohio extends method_ov_or {
    void gina(int a , int b){

        System.out.println(a-b);
    }
    void baka(int a, int b, int c){
        System.out.println(a+b-c*b);
    }

    public static void main(String[] args) {
        ohio hell = new ohio();
        hell.gina(10,113);
        hell.baka(1343,21434);
        hell.baka(12,4,1);
    }
}
