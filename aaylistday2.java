import java.util.ArrayList;

public class aaylistday2 {
    public static void main(String[] args) {
        ArrayList alo = new ArrayList();
        alo.add(129);
        alo.add("years");
        alo.add("old");
        alo.add("japanese are always bald");

        System.out.println(alo);

        ArrayList<String> anime = new ArrayList<String>();
        anime.add("baka");
        anime.add("ragna crimson");
        anime.add("slime");

        for (String fruit : anime)
            System.out.println(fruit);
    }
}
