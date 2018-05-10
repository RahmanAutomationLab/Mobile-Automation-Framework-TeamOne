package testHome;

import home.Home;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestHome extends Home {
    @Test
    public void testHome() throws Exception{
        Home homebutton= PageFactory.initElements(ad, Home.class);
        homebutton.clickHome();
    }
}

