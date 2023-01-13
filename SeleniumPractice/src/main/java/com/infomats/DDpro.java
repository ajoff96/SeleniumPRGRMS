package com.infomats;


	import java.io.FileInputStream;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;
	public class DDpro {
	
		public static void main(String[] args) throws BiffException, IOException, InterruptedException     {
			
			System.setProperty("webdriver.chrome.driver", "D:\\CHROME DRIVER\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
			//JXL or POI
			// take file-> get workbook->mention sheet->track row-->Read Cell value		
			FileInputStream f= new FileInputStream("\"C:\\Users\\HP\\Desktop\\ddpro.xls\"");
			Workbook b=Workbook.getWorkbook(f);
			Sheet s = b.getSheet(0);
			int rowcount =s.getRows();
			
			for(int i=1; i<rowcount; i++){
				// (col,row)   0,1  1,1 |  0,2   1,2 |  0,3   1,3
				String username= s.getCell(0, i).getContents();
				String password=s.getCell(1, i).getContents();
				
				d.findElement(By.id("txt_unam")).sendKeys(username);
				d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys(password);
				d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
				Thread.sleep(5000);
				d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
						
				}
		

	}
	}




