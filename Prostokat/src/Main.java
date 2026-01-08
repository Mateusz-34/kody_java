public class Main {
    public static void main(String[] args) {
        Prostokat p1 = new Prostokat();

        Prostokat p2 = new Prostokat(3.5, 4.2);

        System.out.println(p1);
        System.out.println("Pole: " + p1.obliczPole());
        System.out.println("Obwod: " + p1.obliczObwod());

        System.out.println(p2);
        System.out.println("Pole: " + p2.obliczObwod());
        System.out.println("Obwod: " + p2.obliczObwod());


    }
}