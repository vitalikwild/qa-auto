import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Google extends PageObject
{
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 20000;

    public Google(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    @FindBy(name = "q")
    private WebElement inputField;

    public void setInputField(String searchQuery)
    {
        enter(searchQuery).into(inputField);
    }

    @FindBy(id = "gbqfb")
    private WebElement submitSearch;

    public void setSubmitSearch() throws InterruptedException
    {
        element(submitSearch).click();
    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div[1]/div/h3/a")
    private WebElement firstElement;

    public void setFirstElement(){
        clickOn(firstElement);
    }

    @FindBy(id = "firstHeading")
    private WebElement firstHeading;

    public String getTitleFromPage() {
        return firstHeading.getText();
    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div[2]/div/h3/a")
    private WebElement secondElement;

    public void setSecondElement() {
        clickOn(secondElement);
    }

    @FindBy(id = "Science_and_technology")
    private WebElement secondHeading;

    public String getTitleFromSecondPage(){
        return firstHeading.getText();
    }


}
