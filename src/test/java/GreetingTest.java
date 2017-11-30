import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {


    @Test
    public void defaultTest() {
        System.out.println("The default configuration");
    }

    @Test
    public void testHelloWorld(){
        assertEquals(2, 1+1, "message");
    }


}
