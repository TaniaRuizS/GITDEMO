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
}