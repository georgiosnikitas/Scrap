import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Person p1 = new Person("Chuck", "Norris", null);
        System.out.println("I am "+p1.getFirstname()+", "+p1.getFirstname()+" "+p1.getLastname());
    }
}
