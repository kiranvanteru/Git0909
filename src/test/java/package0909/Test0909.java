package package0909;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import baseUtilities.OpenBrowser;

public class Test0909 extends OpenBrowser {

	@Parameters(value="br")
	@Test
  public void Method0909(String br) {
	  System.out.println("0909 1st test");
	  System.out.println("2nd commit");
	  System.out.println("ramana commit");
	  System.out.println("ramana latest commit5467");
	  
	  OpenBrowser.StartBrowser(br);
	  driver.get("https://www.google.co.in");
	  
  }
	
	@AfterTest
	public void CloseBr() {
		System.out.println("browsers closed");
		driver.close();
	}
}
