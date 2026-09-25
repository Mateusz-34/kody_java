public class ConsoleTest {
    public static void main(String[] args) {
        Sort a1 = new Sort(5);
        a1.input();
        a1.output();
        System.out.println();

        a1.random(5, 15);
        a1.exchangeSort("<=");
        a1.output();
        System.out.println();

        a1.random(5, 15);
        a1.selectionSort("<=");
        a1.output();
        System.out.println();

        a1.random(5, 15);
        a1.insertionSort("<=");
        a1.output();
        System.out.println();

        a1.random(5, 15);
        a1.quickSorts();
        a1.output();
        System.out.println();
    }
}
