package Automation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitClass {
    @Test
    public void setUp(){
        String str = "This is my 1st Junit Program";
        assertEquals("This is my 1st Junit Program",str);
    }
}
