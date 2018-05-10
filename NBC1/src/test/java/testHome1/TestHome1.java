package testHome1;


import home1.Home1;
import org.testng.annotations.*;

public class TestHome1 extends Home1 {
    @Test
    public void testHome() throws Exception {
        clickHome();
    }
}
