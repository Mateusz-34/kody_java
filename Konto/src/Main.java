public class Main {
    public static void main(String[] args) {
        Konto K1 = new Konto("Jan","Kowalski",100.00,2);
        Konto K2 = new Konto("Janina","Nowak");

        System.out.println(K1);
        System.out.println(K2);

        K1.zasil(50);
        K1.przelew(K2,30);

        System.out.println(K1);
        System.out.println(K2);

        K1.obliczOprocentowanie();
        System.out.println(K1.imie);
        System.out.println(K2);
    }
}