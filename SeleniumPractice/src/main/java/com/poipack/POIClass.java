package com.poipack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POIClass {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",  "D:\\CHROME DRIVER\\chromedriver.exe");
	      WebDriver d=new ChromeDriver();
		  d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		  d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  d.manage().window().maximize();
		   // Import excel sheet.
		     File src=new File("C:\\Users\\HP\\Desktop\\POIXL.xlsx");//"C:\Users\HP\Desktop\POIXL.xlsx"
		      
		     // Load the file.
		     FileInputStream finput = new FileInputStream(src);
		      
		     // Load he workbook.
		    XSSFWorkbook workbook = new XSSFWorkbook(finput);
		      
		     // Load the sheet in which data is stored.
		     XSSFSheet sheet= workbook.getSheetAt(0);
		     Cell cell;
		      
		     for(int i=1; i<=sheet.getLastRowNum(); i++)
		     {
		        
		         cell = sheet.getRow(i).getCell(0);
		        // cell.setCellType(Cell.getCellType());
		         d.findElement(By.id("txt_unam")).sendKeys(cell.getStringCellValue());
		          
		        
		         cell = sheet.getRow(i).getCell(1);
		       //  cell.setCellType(Cell.getCellType());
		         d.findElement(By.id("txt_pass")).sendKeys(cell.getStringCellValue());
		         
		         d.findElement(By.id("Button3")).click();
		     }   

	}

}





	


