package soat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class Soat_Test {
	private WebDriver driver;
	SoatPage soatPage;
	
	@Before
	public void setUp() throws Exception {
		soatPage = new SoatPage(driver);
		driver = soatPage.chromeDriverConnection();
		soatPage.visit("https://dev-web.segurosbolivar.com/seguros-en-linea/soat-digital");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		soatPage.quote(BasicData.PLATE, BasicData.TYPE_DOCUMENT_CC, BasicData.DOCUMENT_CC);
		soatPage.ownerDetails();
	}

}
