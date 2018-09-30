package school_72;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public Person(String firstName, String lastName, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }

        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Wiek nie może być mniejszy od zera");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void show (){
        System.out.print(firstName + " " + lastName + "(" + age + ")" + ", e-mail: " + email);
    }

}
