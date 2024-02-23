public class ooops {
    int x=10;
    void show(){
        System.out.println("class A");
    }
}

class inhetinace extends ooops{
    int y = 11;
    void pint(){
        System.out.println("class b");
    }

    public static void main(String[] args) {
         ooops obj = new inhetinace();
         inhetinace hi = new inhetinace();
        System.out.println(obj.x);
        System.out.println(hi.y);
        obj.show();
       // obj.pint();// a can only do the membes of a and not membes of b but b can do both a and b
        hi.pint();
        hi.show();
    }
}
