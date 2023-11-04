package helloworld;
import java.time.*;

public class Person {

private final String firstname;
private final String lastname;
private final LocalDate birthdate;

public Person(String fname, String lname, LocalDate bdate) {
    this.firstname=fname;
    this.lastname=lname;
    this.birthdate=bdate;
}    

public String getFirstname() { return this.firstname; }

public String getLastname() { return this.lastname; }

public LocalDate getBirthdate() { return this.birthdate; }

public int getAge() throws Exception {
    LocalDate today = LocalDate.now();
    return today.getYear()-this.birthdate.getYear();
}

}
