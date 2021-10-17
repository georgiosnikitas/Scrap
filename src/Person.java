import java.util.Date;

public class Person {

private String firstname;
private String lastname;
private Date birthdate;

public Person(String fname, String lname, Date bdate) {
    this.firstname=fname;
    this.lastname=lname;
    this.birthdate=bdate;
}    

public String getFirstname() { return this.firstname; }

public String getLastname() { return this.lastname; }

public Date getBirthdate() { return this.birthdate; }

}
