import java.util.Random;
import java.util.Scanner;

public class Sort {
    int []arr;

    public Sort (int size){
        arr = new int[size];
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            System.out.print("Arr [" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void output(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void random(int min, int max){
        Random random = new Random();

        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(min , max + 1);
        }
    }

    public void exchangeSort(String relation){
        switch (relation){
            case "<=":
                for (int i = 0; i < arr.length - 1; i++){
                    for (int j = 0; j < arr.length - 1 - i; j++){
                        if (arr[j] > arr[j + 1]){
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;
            case ">=":
                for (int i = 0; i < arr.length - 1; i++){
                    for (int j = 0; j < arr.length - 1 - i; j++){
                        if (arr[j] < arr[j + 1]){
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;
            default:
                System.out.print("Niepoprawna relacja");
        }
    }
    public void selectionSort(String relation){
        switch (relation){
            case "<=":
                for (int i = 0; i < arr.length-1; i++) {
                    int min = i;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] < arr[min]){
                            min = j;
                        }
                    }
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
                break;
            case ">=":
                for (int i = 0; i < arr.length -1; i++) {
                    int max = i;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] > arr[max]){
                            max = j;
                        }
                    }
                    int temp = arr[max];
                    arr[max] = arr[i];
                    arr[i] = temp;
                }
                break;
            default:
                System.out.print("Niepoprawna relacja");
        }
    }
    public void insertionSort(String relation){
        switch (relation){
            case "<=":
                for(int i = 1;i<this.arr.length;i++){
                    int key = arr[i];

                    int j = i-1;
                    while (j >= 0 && arr[j] > key){
                        arr[j+1] =arr[j];
                        j -= 1;
                    }
                    arr[j+1] = key;
                }
                break;
            case  ">=":
                for(int i = 1;i<this.arr.length;i++){
                    int key = arr[i];

                    int j = i-1;
                    while (j >= 0 && arr[j] < key){
                        arr[j+1] =arr[j];
                        j -= 1;
                    }
                    arr[j+1] = key;
                }
                break;
            default:
                System.out.println("Niepoprawna relacja!");
        }
    }

    private  int  quickSortHelper(int low, int high){
        int pivot = arr[high];

        int i = low;

        for(int j = low;j<high;j++){
            if(arr[j] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i += 1;
            }
        }

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    private  void  quickSort(int low,int high){
        if(low < high){
            int pivotIndex = quickSortHelper(low,high);

            quickSort(low,pivotIndex-1);
            quickSort(pivotIndex+1,high);
        }
    }

    public  void  quickSorts(){
        quickSort(0,this.arr.length-1);
    }
}
