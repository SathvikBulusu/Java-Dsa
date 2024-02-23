public class mvwi {
    static void push(String chest , String shoulders,String triceps){
        System.out.println(chest+shoulders+triceps);
    }
    void pull (String back , String biceps){
        System.out.println(back+biceps);
    }
}

class legs extends mvwi{
   static void push(String chest ,String shoulders){
        System.out.println(chest+shoulders);
    }

    public static void main(String[] args) {
        legs nebula = new legs();
        nebula.push("incline bench press"," & dummbell press ");
        nebula.pull("deadlift"," & bicep curl");
    }
}
// static methods can be overloaded
// private methods can be overloaded but cannot be overrided


