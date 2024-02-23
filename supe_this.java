public class supe_this {
    // this program is going to be about super and this
    int x = 10;

    void showww(){
        System.out.println("byakuya");
    }
}
class ichigo extends supe_this{
    int x = 20;
    ichigo(){}
    void show(){
        System.out.println("rukia");
    }
    void pint(){
        int x = 30;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
        super.showww();
    }

    public static void main(String[] args) {
        ichigo bo = new ichigo();
        bo.pint();
        //super.show(); super , this  is not allowed in static
        bo.showww();
        //
    }
}
