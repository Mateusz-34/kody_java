public class Osoba {
    private String Name;
    private String Surname;
    private int Day;
    private int Month;
    private int Year;
    private String Gender;

    public Osoba(String Name, String Surname, int Day, int Month, int Year, String Gender) {
        this.Name = Name;
        this.Surname = Surname;
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return "Imie: " + Name + ", Nazwisko: " + Surname + ", Data Urodzenia: " + Day + "." + Month + "." + Year + ", Plec: " + Gender;
    }
}