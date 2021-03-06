package co.com.choucair.certification.automatizaciondemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterData extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("where we write the first name").located
            (By.xpath("//input[@ng-model= 'FirstName']"));
    public static final Target INPUT_LASTNAME = Target.the("Where we write the last name").located
            (By.xpath("//input[@ng-model= 'LastName']"));
    public static final Target INPUT_ADDRESS = Target.the("Where we write the address").located
            (By.xpath("//textarea[@ng-model= 'Adress']"));
    public static final Target INPUT_EMAIL = Target.the("Where we write the email").located
            (By.xpath("//input[@ng-model= 'EmailAdress']"));
    public static final Target INPUT_PHONE = Target.the("Where we write the phone").located
            (By.xpath("//input[@ng-model= 'Phone']"));
    public static final Target SELECT_GENDER_FEMALE = Target.the("where you select the gender female").located
            (By.xpath("//input[@value= 'FeMale']"));
    public static final Target SELECT_GENDER_MALE = Target.the("where you select the male").located
            (By.xpath("//input[@value= 'Male']"));
    public static final Target SELECT_HOBBIES_CRICKET = Target.the("where you select the hobbies Cricket").located
            (By.xpath("//input[@value= 'Cricket']"));
    public static final Target SELECT_HOBBIES_MOVIES = Target.the("where you select the hobbies Movies").located
            (By.xpath("//input[@value= 'Movies']"));
    public static final Target SELECT_HOBBIES_HOCKEY = Target.the("where you select the hobbies Hockey").located
            (By.xpath("//input[@value= 'Hockey']"));
    public static final Target SELECT_CLICK_LANGUAGE = Target.the("where do you click on language").
            located(By.xpath("//div[@class= 'ui-autocomplete-multiselect ui-state-default ui-widget']"));
    public static final Target SELECT_CLICK_OUT = Target.the("Click outside").located
            (By.xpath("//div[@class= 'row ']"));
    public static final Target SELECT_CLICK_SKILLS = Target.the("where do you click on skills").located
            (By.xpath("//select[@id= 'Skills']"));
    //public static final Target CLICK_COUNTRY = Target.the("where do you click on Country").located
            //(By.xpath("//select[@id= 'countries']"));
    public static final Target SELECT_CLICK_COUNTRY = Target.the("where do you click on Country").located
            (By.xpath("//span[@class= 'select2-selection__arrow']"));
    public static final Target INPUT_COUNTRY = Target.the("where you write the Country").located
            (By.xpath("//input[@class= 'select2-search__field']"));
    public static final Target SELECT_YEAR = Target.the("where you select the year").located
            (By.id("yearbox"));
    public static final Target SELECT_MONTH = Target.the("where you select the month").located
            (By.xpath("//select[@ng-model='monthbox']"));
    public static final Target SELECT_DAY = Target.the("where you select the day").located
            (By.id("daybox"));
    public static final Target INPUT_PASSWORD = Target.the("write password to create")
            .located(By.xpath("//input[@ng-model='Password']"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("write password to confirm")
            .located(By.xpath("//input[@ng-model='CPassword']"));
    public static final Target ENTER_BUTTONSUBMIT = Target.the("Select button submit")
            .located(By.name("signup"));
    public static final Target SELECT_ITEM_LIST = Target.the("Select an item from the list message").
    located(By.xpath("//option[contains(text(), 'Select Country')]"));
}
