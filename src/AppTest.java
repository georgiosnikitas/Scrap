
import static org.junit.Assert.*;
import java.time.LocalDate;
import org.junit.Test;

public class AppTest {

    @Test
    public void test_Lastname() {
        System.out.println("Testing person's lastname");
        String str1="Ken";
        assertEquals(new Person("Clark", "Ken", null).getLastname(), str1);
    }

    @Test
    public void test_Age() {
        System.out.println("Testing person's age");
        Integer int1=10;
        try {
        int age = new Person("Clark", "Ken", LocalDate.of(2011,10,26)).getAge();
            assertEquals(Integer.valueOf(age), int1);
        } catch(Exception e) {
            assertEquals(true, false);
        }
    }

}