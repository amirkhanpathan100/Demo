package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Testbase.Testbase;

public class Snapshot extends Testbase {
	
	public void capturescreen(String testname) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Amir\\eclipse-workspace\\Demo_Group\\Test Snapshots\\"+testname+".jpeg");
		FileHandler.copy(source, destination);
	}
}
