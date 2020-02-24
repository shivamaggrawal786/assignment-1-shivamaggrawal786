import java.util.ArrayList;

public class Person {
    String firstname;
    String lastname;
    ArrayList<String> number;
    String email;

    public Person(String firstname, String lastname, ArrayList number, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public ArrayList<String> getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }
}