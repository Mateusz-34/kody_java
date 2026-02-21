public class Main {
    public static void main(String[] args) {
        Kosci k1 = new Kosci();

        k1.rzut();
        k1.wyswietlRzut();
        k1.zablokuj(0);
        k1.zablokuj(2);
        k1.odblokuj(2);
        k1.rzut();
        k1.wyswietlRzut();
    }
}