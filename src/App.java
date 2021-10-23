import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Person p1 = new Person("Chuck", "Norris", LocalDate.of(1968,10,26));
        System.out.println("I am "+p1.getFirstname()+", "+p1.getFirstname()+" "+p1.getLastname());
        
        try {
            System.out.println("... and I am "+p1.getAge()+" years old");
        } catch(Exception e) {
            System.out.println("... birthdate not defined, can't calculate age");
        }
        
    }
}
