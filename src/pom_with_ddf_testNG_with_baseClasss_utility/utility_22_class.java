package pom_with_ddf_testNG_with_baseClasss_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility_22_class {
	
	
	public String getTd(int rowindex,int cellindex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		       String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		       return value;
	}
	public static void capturess(WebDriver driver,int Tcd) throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Akshay\\eclipse-workspace\\.metadata\\.plugins\\12marchselenium2\\Screenshot\\akki13"+Tcd+".jpg");
		FileHandler.copy(src, dest);
	}

	
public static String getPFdata(String key) throws IOException  {
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\eclipse-workspace\\.metadata\\.plugins\\12marchselenium2\\dataimp.properties");
		
		Properties p=new Properties();
		p.load(file);
		String value =p.getProperty(key);
		return value;
	}
	
	
	
	
	
	
	
	
	

}
