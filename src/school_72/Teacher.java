package school_72;

public class Teacher extends Person {
    private String wykladanyPrzedmiot ;
    private double wynagrodzenie;

    public Teacher(String firstName, String lastName, int age, String email, String wykladanyPrzedmiot, double wynagrodzenie) {
        super(firstName, lastName, age, email);
        this.wykladanyPrzedmiot = wykladanyPrzedmiot;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getWykladanyPrzedmiot() {
        return wykladanyPrzedmiot;
    }

    public void setWykladanyPrzedmiot(String wykladanyPrzedmiot) {
        this.wykladanyPrzedmiot = wykladanyPrzedmiot;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public void show (){
        System.out.print("Wykładowca: ") ;
        super.show();
        System.out.println(", Wykładany przedmiot: " + wykladanyPrzedmiot + ", wynagrodzenie: " + wynagrodzenie + " PLN");
    }
}
