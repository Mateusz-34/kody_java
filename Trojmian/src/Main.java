public class Main {
    public static void main(String[] args) {
        Trojmian t1 = new Trojmian(1,0,1);
        Trojmian t2 = new Trojmian(1,-2,1);
        Trojmian t3 = new Trojmian(1,0,-1);


        System.out.println(t1);
        System.out.println(t1.delta());
        System.out.println(t1.ileRozwiazan());

        System.out.println(t2);
        System.out.println(t2.delta());
        System.out.println(t2.ileRozwiazan());

        System.out.println(t3);
        System.out.println(t3.delta());
        System.out.println(t3.ileRozwiazan());

    }
}