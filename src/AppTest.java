
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    @Test
    public void test_JUnit() {
        System.out.println("Testing Person");
        String str1="Ken";
        assertEquals(new Person("Clark", "Ken", null).getLastname(), str1);
    }

}