package POM;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunnerClass extends BaseClass{
	
	// @BeforeTest
	// @Test
	// @AfterTest
	
	LoginWebElements lw ;
	
	@BeforeTest
	public void bt()
	{
		BaseClass.intilize();
		BaseClass.geturl();
	}
	
	@Test
	public void execution()
	{
		lw = new LoginWebElements();
		lw.validcredentails();
	}
	
	@AfterTest
	public void at()
	{
		lw.close();
	}
	
	
	
}
