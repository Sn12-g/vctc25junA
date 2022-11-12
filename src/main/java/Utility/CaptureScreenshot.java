package Utility;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class CaptureScreenshot extends TestBase {

	public static void screenshot(String name) throws Exception {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ACER\\eclipse-workspace\\eclipse. workspace shortcut\\SauceLabFrame\\Screenshot\\photo"+name+".jpeg");
		FileHandler.copy(source, dest);
	}
	

		
}

