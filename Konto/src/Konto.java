public class Konto {
    private static int nextID = 1;

    int id;
    String imie,nazwisko;
    double saldoKonta,oprocentowanie;

    public Konto(String imie,String nazwisko,double saldoKonta,double oprocentowanie){
        this.id = nextID++;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.saldoKonta = saldoKonta;
        this.oprocentowanie = oprocentowanie;
    }

    public Konto(String imie,String nazwisko){
        this.id = nextID++;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oprocentowanie = 0.01;
    }

    public String toString(){
        return "id: " + this.id + ", imie i nazwisko: " + this.imie + " " + this.nazwisko + ", saldo: " + this.saldoKonta + ", oprocentowanie: " + this.oprocentowanie;
    }

    public void zasil (int amount){
        if (amount > 0) {
            saldoKonta += amount;
        } else {
            throw new RuntimeException("Ujemna kwota zasilania");
        }
    }

    public void wypisz(int amount){
        if (saldoKonta < amount){
            throw new RuntimeException("Brak funduszy na operacje");
        } else if (amount < 0){
            throw new RuntimeException("Ujemna kwota wyplaty");
        } else {
            saldoKonta += amount;
        }
    }

    public void przelew (Konto cel, double kwota){
        if (saldoKonta < kwota){
            throw new RuntimeException("Brak srodkow");
        } else if (kwota < 0) {
            throw new RuntimeException("Kwota nie moze byc ujemna");
        } else {
            this.saldoKonta -= kwota;
            cel.saldoKonta += kwota;
        }
    }

    public void obliczOprocentowanie(){
        saldoKonta += saldoKonta*oprocentowanie;
    }
}