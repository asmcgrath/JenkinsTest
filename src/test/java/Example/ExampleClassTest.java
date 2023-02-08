package Example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleClassTest {

    @Test
    public void testHelloWorld() {
        System.out.println("Test Hello World");
        assertEquals("Hello World", ExampleClass.helloWorld());
    }
}
