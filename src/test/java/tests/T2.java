package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Demospage;

public class T2 extends BaseTest {

	Demospage ref2;
	
	@BeforeClass
	public void initObject() {
		ref2 = new Demospage(driver);
	}
	@Test (priority=1)
	public void DmspgMethod() throws InterruptedException {
		ref2.drop();
		
	}
}
