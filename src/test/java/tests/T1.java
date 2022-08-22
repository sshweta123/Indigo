package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.P1;

public class T1 extends BaseTest {
	P1 ref1;
	
	@BeforeClass
	public void initObject() {
		ref1 =new P1(driver);
		
	}

	@Test (priority=1)
	public void AbtbtnMethod() throws InterruptedException {
		ref1.abtbtn();
	}
	@Test (priority=2)
	public void DmsMethod() throws InterruptedException {
		ref1.dmsbtn();
		
	}
}
