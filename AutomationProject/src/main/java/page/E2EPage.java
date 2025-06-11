package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;


public class E2EPage {
    public WebDriver driver;

    public E2EPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Signup / Login") WebElement sign;

    @FindBy(name = "name") WebElement name;
    @FindBy(xpath = "//input[@data-qa='signup-email']") WebElement email2;
    @FindBy(xpath = "//input[@data-qa='login-email']") WebElement email1;
    @FindBy(name = "password") WebElement password2;

    @FindBy(xpath = "//button[@data-qa='signup-button']") WebElement signupbtn;
    @FindBy(xpath = "//button[@data-qa='login-button']") WebElement signinbtn;

    @FindBy(id = "id_gender1") WebElement radiogender;
    @FindBy(id="password") WebElement password1;

    @FindBy(id = "days") WebElement days;
    @FindBy(id = "months") WebElement months;
    @FindBy(id = "years") WebElement years;

    @FindBy(id = "newsletter") WebElement checkbox1;
    @FindBy(id = "optin") WebElement checkbox2;

    @FindBy(id = "first_name") WebElement firstname;
    @FindBy(id = "last_name") WebElement lastname;
    @FindBy(id = "company") WebElement company;
    @FindBy(id = "address1") WebElement address;
    @FindBy(id = "country") WebElement country;
    @FindBy(id = "state") WebElement state;
    @FindBy(id = "city") WebElement city;
    @FindBy(id = "zipcode") WebElement zipcode;
    @FindBy(id = "mobile_number") WebElement mobileNo;

    @FindBy(xpath = "//button[@data-qa='create-account']") WebElement createAcc;

    @FindBy(xpath = "//a[@data-qa='continue-button']") WebElement continuebtn;
    @FindBy(xpath = "//a[@href='/logout']") WebElement logout;

    @FindBy(xpath = "//a[@href='/test_cases']") WebElement testcasePage;
    @FindBy(xpath = "//a[@href='/contact_us']") WebElement contactusPage;

    @FindBy(xpath = "//input[@data-qa='name']") WebElement nameCu;
    @FindBy(xpath = "//input[@data-qa='email']") WebElement emailCu;
    @FindBy(xpath = "//input[@data-qa='subject']") WebElement subject;
    @FindBy(id = "message") WebElement message;
    @FindBy(name = "upload_file") WebElement file;
    @FindBy(xpath = "//input[@data-qa='submit-button']") WebElement submitbtn;
    @FindBy(xpath = "//a[@href='/products']") WebElement products;
    @FindBy(id = "search_product") WebElement searchProd;
    @FindBy(id = "submit_search") WebElement submitSearch;
    @FindBy(xpath = "//a[@href='/product_details/1']") WebElement product1;
    @FindBy(xpath = "//button[contains(@class, 'cart') and .//text()[contains(., 'Add to cart')]]") WebElement add2CartBtn;
    @FindBy(xpath = "//button[contains(@class, 'btn-success') and contains(text(), 'Continue Shopping')]") WebElement continueShopBtn;
    @FindBy(xpath = "//a[@href='/view_cart']") WebElement viewCart;
    @FindBy(xpath = "//a[contains(@class, 'check_out') and contains(text(), 'Proceed To Checkout')]") WebElement checkOut;
    @FindBy(xpath = "//a[@href='/payment']") WebElement payment;
    @FindBy(xpath = "//input[@data-qa='name-on-card']") WebElement cardName;
    @FindBy(xpath = "//input[@data-qa='card-number']") WebElement cardNo;
    @FindBy(xpath = "//input[@data-qa='cvc']") WebElement cvc;
    @FindBy(xpath = "//input[@data-qa='expiry-month']") WebElement mm;
    @FindBy(xpath = "//input[@data-qa='expiry-year']") WebElement yyyy;
    @FindBy(id = "submit") WebElement submit;

    public void setSignUp() throws IOException {
        sign.click();

        name.sendKeys("Justin");
        email2.sendKeys("justin121@abc.com");
        signupbtn.click();
    }

    public void setAccInfo(){
        radiogender.click();
        password1.sendKeys("Abc@1234");

        Select dayDrop = new Select(days);
        dayDrop.selectByIndex(10); // Selects the option at index 10

        Select monthDrop = new Select(months);
        monthDrop.selectByVisibleText("May");

        Select yearDrop = new Select(years);
        yearDrop.selectByValue("2004");

        checkbox1.click();
        checkbox2.click();

        firstname.sendKeys("Justin");
        lastname.sendKeys("Grande");
        company.sendKeys("BinBox");
        address.sendKeys("XYZ Street , M.G Road , Surat");

        Select countryDrop = new Select(country);
        countryDrop.selectByValue("India");

        state.sendKeys("Gujarat");
        city.sendKeys("Surat");
        zipcode.sendKeys("394315");
        mobileNo.sendKeys("9998887776");

        createAcc.click();

    }

    public void setContinue(){
        continuebtn.click();
    }

    public void setLogout(){
        logout.click();
    }

    public void setSignIn(){
        sign.click();
        email1.sendKeys("justin121@abc.com");
        password2.sendKeys("Abc@1234");
        signinbtn.click();
    }

    public void setPages(){
        testcasePage.click();

    }

    public void setContactusPage(){
        contactusPage.click();
        nameCu.sendKeys("Justin");
        emailCu.sendKeys("justin121@abc.com");
        subject.sendKeys("Feedback");
        message.sendKeys("Good Experience");
        file.sendKeys("E:\\PXL_20240501_034722912.jpg");
        submitbtn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void setProducts(){
        products.click();
        searchProd.sendKeys("Top");
        submitSearch.click();
        product1.click();
        add2CartBtn.click();
        continueShopBtn.click();
    }

    public void viewCart(){
        viewCart.click();
        checkOut.click();
        payment.click();
        cardName.sendKeys("Justin");
        cardNo.sendKeys("123456789012");
        cvc.sendKeys("311");
        mm.sendKeys("12");
        yyyy.sendKeys("2027");
        submit.click();


    }
}