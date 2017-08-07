package com.mindtree.autodemotours.generic;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utility {
	
	public static void getScreenShot(String path){
		try{
		Robot r = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(d);
		BufferedImage src = r.createScreenCapture(rect);
		ImageIO.write(src, ".png", new File(path));	
		}
		catch (Exception e){
			
		}
	}
	
	public static void getScreenShot(WebDriver driver,String path){
		try{
		TakesScreenshot t = (TakesScreenshot) driver;
		 File src = t.getScreenshotAs(OutputType.FILE);
	     File dest = new File(path);
	     FileUtils.copyFile(src, dest);
	}
		catch(Exception e){
			
		}
	}
	
	public static String now() {
		SimpleDateFormat s = new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		 String timeStamp = s.format(new Date());
		 return timeStamp;
	}
	
	public static void sleep(int seconds){
		try{
			Thread.sleep(seconds*1000);
		}
		catch(Exception e){
			
		}
	}
	
	public static String getProperties(String key,String path){
		String value = "";
		try{
		Properties p = new Properties();
		p.load(new FileReader(path));
		value = p.getProperty(key);
		}
		catch(Exception e){
			
		}
		return value;
		
	}
}


