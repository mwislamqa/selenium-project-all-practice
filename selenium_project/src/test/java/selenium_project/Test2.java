package selenium_project;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	Reporter report= new Reporter();
	
	@Test
	public void tc_4() {
		report.log("this 4th test case is loging with invalid data");
		System.out.println("4th test case");
	}
	@Test
	public void tc_5() {
		System.out.println("5th test case");
	}
	@Test
	public void tc_6() {
		System.out.println("6th test case");
	}

}
