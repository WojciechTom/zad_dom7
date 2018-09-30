package school_72;

public class Student extends Person {
    private int numerIndeksu;
    private String kierunek;
    private int rokStud;

    public Student(String firstName, String lastName, int age, String email, int numerIndeksu, String kierunek, int rokStud) {
        super(firstName, lastName, age, email);
        this.numerIndeksu = numerIndeksu;
        this.kierunek = kierunek;
        this.rokStud = rokStud;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        kierunek = kierunek;
    }

    public int getRokStud() {
        return rokStud;
    }

    public void setRokStud(int rokStud) {
        this.rokStud = rokStud;
    }

    @Override
    public void show (){
        System.out.print("Student: ") ;
        super.show();
        System.out.println(", Numer Indeksu: " + numerIndeksu + ", kierunek: " + kierunek + ", rok studiów: " + rokStud);
    }
}
