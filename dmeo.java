public class dmeo {
    int x = 9;
    void show(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        dmeo d = new dmeo();
        d.x = 10;
        d.show();
        System.out.println(d.x);

    }

}