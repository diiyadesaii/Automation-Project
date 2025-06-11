package test;

import page.E2EPage;
import base.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class E2ETest extends Base {
    E2EPage e2e;

    @Test
    public void testRun() throws IOException, InterruptedException {
        e2e = new E2EPage(driver);

        e2e.setSignUp();
        e2e.setAccInfo();
        e2e.setContinue();
        e2e.setLogout();

        e2e.setSignIn();
        e2e.setPages();
        e2e.setPages();
        e2e.setContactusPage();
        e2e.setProducts();
        e2e.viewCart();

    }
}