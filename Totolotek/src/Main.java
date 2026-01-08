public class Main {
    public static void main(String[] args) {
        Totolotek t = new Totolotek();

        t.wprowadzLiczby();
        t.wylosujLiczby();

//        int i = t.ileTrafien();

        System.out.print("Wprowadzone liczby: ");
        t.wypiszWprowadzone();
        System.out.println();

        System.out.println("Wylosowane liczby: ");
        t.wypiszWylosowane();
        System.out.println();

//        System.out.println("Trafiles: " + i + "liczb");
//
//        int[] tab = t.trafienia();
//        System.out.println("Trafione liczby: ");
//
//        for (int i = 0; i < tab.length; i++){
//            System.out.print(tab[i] + " ");
//        }
    }
}