import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class GoogleNavigation extends ScenarioSteps
{
    Google google;
    public GoogleNavigation(Pages pages)
    {
        super(pages);
    }

    @Step
    public void start_browser()
    {
        Google loginPage = getPages().get(Google.class);
        loginPage.open();
    }

    @Step
    public void input_search_query(String searchQuery)
    {
        google.setInputField(searchQuery);
    }

    @Step
    public void click_to_submit_search_query() throws InterruptedException
    {
        google.setSubmitSearch();
    }

/*    @Step
    public void clickOnFirstElement(){
        google.setFirstElement();
    }

    @Step
    public String wikiTitle() {
        return google.getTitleFromPage();
    }*/

    @Step
    public void clickOnSecondElement() {
        google.setSecondElement();
    }

    @Step
    public String wikiTitle2(){
        return google.getTitleFromSecondPage();
    }
}
