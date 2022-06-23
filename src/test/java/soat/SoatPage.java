package soat;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class SoatPage extends BasicWrap{

	public SoatPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void quote(String Plate, String TypeDocument, String Document) {
		try {
			type(Plate, LocatorsSoat.LOCATOR_PLATE);
			Thread.sleep(2000);
			click(LocatorsSoat.LOCATOR_TYPE_DOCUMENT);
			if(BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			if(BasicData.TYPE_DOCUMENT_CE.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			if(BasicData.TYPE_DOCUMENT_CD.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			if(BasicData.TYPE_DOCUMENT_CF.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			if(BasicData.TYPE_DOCUMENT_PP.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			if(BasicData.TYPE_DOCUMENT_TI.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			if(BasicData.TYPE_DOCUMENT_NT.equals(TypeDocument)) {
				driver.findElement(By.xpath("//mat-option/span[contains(.,'"+TypeDocument+"')]")).click();
			}
			type(Document, LocatorsSoat.LOCATOR_DOCUMENT);
			type(BasicData.EMAIL, LocatorsSoat.LOCATOR_EMAIL);
			click(LocatorsSoat.LOCATOR_BUTTON_QUOTE);
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
	
	public void ownerDetails() {
		try {
			Thread.sleep(5000);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(15000);
			click(LocatorsSoat.LOCATOR_ACCEPT_POLICIES);
			click(LocatorsSoat.LOCATOR_BUTTON_PAY);
		} catch (NoSuchElementException e) {
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
