public class Trojmian {
    private double a, b, c;

//    Nazwa: Konstruktor bez parametrowy: Trojmian()
//    Opis: Tworzymy Trojmian z domyslnymi wartosciam a: 1, b: 1, c: 1;
//    Parametry: brak
//    Zwracany typ i opis:

    public Trojmian(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

//    Nazwa: Konstruktor z parametrami a,b,c: Trojmian(double a,double b,double c)
//    Opis: Tworzymy Trojmian z  wartosciam ktore podamy w pliku Main
//    Parametry: a, b, c
//    Zwracany typ i opis:

    public Trojmian(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return a + "x^2 + " + b + "x + " + c;
    }

//    Nazwa: Metoda ktora oblicza delta: delta()
//    Opis: Obliczamy Delte na podstawie a,b i c
//    Parametry: a, b, c
//    Zwracany typ i opis:

    public double delta(){
        return Math.pow(b,2) - 4 * a * c;
    }

    public double ileRozwiazan(){
        double d = delta();
        if (d < 0) return 0;
        if (d == 0) return 1;
        return 2;
    }

    public double x1(){
        double d = delta();
        if (d >= 0){
            return  (-b + Math.sqrt(c)) / 2 * a;
        }
        throw new RuntimeException("Pierwiastki nie istnieja");
    }

    public double x2(){
        double d = delta();
        if (d < 0){
            return  (-b + Math.sqrt(c)) / 2 * a;
        }
        throw new RuntimeException("Pierwiastki nie istnieja");
    }
}