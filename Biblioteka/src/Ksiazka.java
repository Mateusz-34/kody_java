public class Ksiazka {
    String tytul, autor;
    int rokWydania;
    Boolean czyDostepne;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public Boolean getCzyDostepne() {
        return czyDostepne;
    }

    public void setCzyDostepne(Boolean czyDostepne) {
        this.czyDostepne = czyDostepne;
    }

    public void wypozycz(){

    }

    public void zwroc(){

    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", rokWydania=" + rokWydania +
                ", czyDostepne=" + czyDostepne +
                '}';
    }
}