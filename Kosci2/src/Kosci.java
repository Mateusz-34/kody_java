import java.util.Random;

public class Kosci {
    private int[] rzut = new int[5];
    private boolean[] dostepne = new boolean[5];

    public Kosci(){
        for (int i = 0; i < 5; i++){
            dostepne[i] = true;
        }
    }

    public void rzut(){
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            if (this.dostepne[i]){
                rzut[i] = random.nextInt(1,7);
            }
        }
    }

    public void zablokuj(int i){
        dostepne[i] = false;
    }

    public void odblokuj(int i){
        dostepne[i] = true;
    }

    public void wyswietlRzut(){
        for (int i = 0; i < 5; i++){
            System.out.print(rzut[i] + " ");
        }
        System.out.println();
    }
}