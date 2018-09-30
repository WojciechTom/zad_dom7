package school_72;

public class School {
    public static void main(String[] args) {

Student s1 = new Student ("Karol", "Zawadzki", 23 ,"zawadzki@gmail.com",121354, "ZiF", 2 );
Student s2 = new Student ("Waldemar", "Król", 20 ,"krol@wp.pl",121321, "ZiF", 2 );
Student s3 = new Student ("Kazimierz", "Wielki", 21 ,"kazik.wieli@gmail.com",321354, "IE", 3 );

Teacher t1 = new Teacher("Piotr", "Wysocki",41,"piotr.w@wp.pl", "Makroekonomia", 5000 );
Teacher t2 = new Teacher("Bartosz", "Kot",41,"kotek@wp.pl", "Programowanie", 6000 );


s1.show();
s2.show();
s3.show();
t1.show();
t2.show();

    }
}
