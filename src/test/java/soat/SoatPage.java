package soat;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class SoatPage extends BasicWrap{

	public SoatPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void quote(String Plate, String Document) {
		try {
			type(Plate, LocatorsSoat.LOCATOR_PLATE);
			//click(LocatorsSoat.LOCATOR_TYPE_DOCUMENT);
			//WebElement link_to = driver.findElement(LocatorsSoat.LOCATOR_TYPE_DOCUMENT);
			//Select dropdown = new Select(link_to);
			//dropdown.selectByVisibleText("C.C.");
			type(Document, LocatorsSoat.LOCATOR_DOCUMENT);
			type(BasicData.EMAIL, LocatorsSoat.LOCATOR_EMAIL);
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
