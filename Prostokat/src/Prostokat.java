public class Prostokat {
    private double szerokosc;
    private double wysokosc;

//    Nazwa: Konstruktor bez parametrowy: Prostokat()
//    Opis: Tworzymy Prostokat z domyslnymi wartosciam szerokosc: 1.0 , wysokosc: 1.0
//    Parametry: brak
//    Zwracany typ i opis:

    public Prostokat(){
        this.szerokosc = 1.0;
        this.wysokosc = 1.0;
    }

//    Nazwa: Konstruktor z parametrami szerokosc,wysokosc: Prostokat(double szerokosc,double wysokosc)
//    Opis: Tworzymy Prostokat z  wartosciam ktore podamu w pliku Main
//    Parametry: szerokosc, wysokosc
//    Zwracany typ i opis:

    public Prostokat(double szerokosc,double wysokosc){
        setSzerokosc(szerokosc);
        setWysokosc(wysokosc);
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }
//    Nazwa: Metoda ktora oblicza pole: obliczPole()
//    Opis: Obliczamy Pole na podstawie szrokosci i wysokosc
//    Parametry: szerokosc, wysokosc
//    Zwracany typ i opis:


    public double obliczPole(){
        return szerokosc * wysokosc;
    }

//    Nazwa: Metoda ktora oblicza obwod: obliczObwod()
//    Opis: Obliczamy Obwod na podstawie bokow
//    Parametry: szerokosc, wysokosc
//    Zwracany typ i opis:


    public double obliczObwod(){
        return 2 * (szerokosc + wysokosc);
    }

    @Override
    public String toString(){
        return "Prostokat[szerokość=" + szerokosc + ",wysokość=" + wysokosc + "]";
    }

//    Autor: 17
}