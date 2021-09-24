package org.data;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BMS {
	static String[] XLReader() throws IOException, InterruptedException, AWTException
	{
		File loc = new File("C:\\Users\\Admin\\eclipse-workspace\\DataDrivenProject\\Excel\\ShowBook.xlsx");
		
		//Read Input 
		FileInputStream fs = new FileInputStream(loc);
		
		// get workbook object
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet s = wb.getSheetAt(0);
		
		//get sheet of excel file
		String data0 = s.getRow(0).getCell(0).getStringCellValue();
		String data1 = s.getRow(1).getCell(0).getStringCellValue();
		String data2 = s.getRow(2).getCell(0).getStringCellValue();
		String[] xs = new  String[] {data0, data1, data2};
		String[] ret = new String[3];
		ret[0] = xs[0];
		ret[1] = xs[1];
		ret[2] = xs[2];
		return ret;
	}

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// | Chrome Driver | //		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		 | Mozela Fire Fox Driver |		
		//System.setProperty("webdriver.gecko.driver",
		//		"C:\\Users\\Admin\\eclipse-workspace\\DataDrivenProject\\driver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/explore/home"); 		//Navigate the URL

		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//*[@id=\"wzrk_wrapper\"]/div[2]")) != null)
		{
			WebElement mou = driver.findElement(By.xpath("//*[@id=\"wzrk-cancel\"]")); 		//popup message cancel option click
			Actions ac = new Actions(driver);
			ac.click(mou).build().perform();
		}
		if(driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[1]/span")) != null)
		{	
			WebElement mou1 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[1]/span"));
			Actions Acc = new Actions(driver);   //select drop down of city's
			Acc.click(mou1).build().perform();
		}
		else
		{
			WebElement moux = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/div/div/div[2]/div[1]/span"));
			Actions Accx = new Actions(driver);
			Accx.click(moux).build().perform();
		}
		
		Thread.sleep(2000);
		String[] res = XLReader();
		Actions ac = new Actions(driver);
		Robot r = new Robot();		//robot object creation for keyboard key press
		{			
			Thread.sleep(2000);
			//for first city			//give the location from EXCEL file and search the location in that drop down
			WebElement data = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input"));
			Thread.sleep(2000);
			data.sendKeys(res[0]);		// send city name key using above for loop and array of XLReader Method
			r.keyPress(KeyEvent.VK_ENTER); //Press Enter after chennai in text box
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			//click on Movie Button
			WebElement mou3 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]"));
			ac.doubleClick(mou3).build().perform();
			Thread.sleep(3000);		
			//click on first movie in the list
			WebElement mou4 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[2]/div/img"));
			ac.doubleClick(mou4).build().perform();

			Thread.sleep(3000);
			// select the city name and print it on console
			WebElement cityname = driver.findElement(By.xpath("//*[@id=\"super-container\"]/header/div[1]/div/div/div/div[2]/div[1]/span"));
			String city1 = cityname.getText();
			//System.out.println(cityname);		
						
			Thread.sleep(3000);						
			//Select About the movie and print it on cosole
			WebElement movname = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div/div/div[2]/h1"));
			String movie1 = movname.getText();
			
			Thread.sleep(3000);				
			//Select About the movie and print it on console
			WebElement about = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section[1]/section/span/div/span"));
			String aboutmovie1 = about.getText();

			
//for second city			//give the location from EXCEL file and search the location in that drop down
			Thread.sleep(2000);
			driver.get("https://in.bookmyshow.com/explore/home");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/header/div[1]/div/div/div/div[2]/div[1]/span")).click();
			//driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div/div/input")).click();
			Thread.sleep(2000);
			WebElement data1 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div/div/input"));
			data1.sendKeys(res[1]);		// send city name key using above for loop and array of XLReader Method
			//Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER); //Press Enter after chennai in text box
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			//click on Movie Button
			WebElement mou31 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]"));
			ac.doubleClick(mou31).build().perform();

			Thread.sleep(3000);		
			//click on first movie in the list
			WebElement mou41 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[2]/div/img"));
			ac.doubleClick(mou41).build().perform();

			Thread.sleep(3000);
			// select the city name and print it on console
			WebElement cityname1 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/header/div[1]/div/div/div/div[2]/div[1]/span"));
			String city11 = cityname1.getText();
			//System.out.println(cityname);		
						
			Thread.sleep(3000);						
			//Select About the movie and print it on cosole
			WebElement movname1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div/div/div[2]/h1"));
			String movie11 = movname1.getText();
			
			Thread.sleep(3000);				
			//Select About the movie and print it on console
			WebElement about1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section[1]/section/span/div/span"));
			String aboutmovie11 = about1.getText();
			
//for Third city			//give the location from EXCEL file and search the location in that drop down
			Thread.sleep(3000);
			driver.get("https://in.bookmyshow.com/explore/home");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/header/div[1]/div/div/div/div[2]/div[1]/span")).click();
			//driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div/div/input")).click();
			Thread.sleep(3000);
			WebElement data2 = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div/div/input"));
			data2.sendKeys(res[2]);		// send city name key using above for loop and array of XLReader Method
			//Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER); //Press Enter after chennai in text box
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			//click on Movie Button
			WebElement mou32 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[2]/div/div/div/div[1]/div/a[1]"));
			ac.doubleClick(mou32).build().perform();

			Thread.sleep(3000);		
			//click on first movie in the list
			WebElement mou42 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[4]/div[2]/div[4]/div/div/div[2]/a[1]/div/div[2]/div/img"));
			ac.doubleClick(mou42).build().perform();

			Thread.sleep(3000);
			// select the city name and print it on console
			WebElement cityname2 = driver.findElement(By.xpath("//*[@id=\"super-container\"]/header/div[1]/div/div/div/div[2]/div[1]/span"));
			String city2 = cityname2.getText();
			//System.out.println(cityname);		
						
			Thread.sleep(3000);						
			//Select About the movie and print it on cosole
			WebElement movname2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/section[1]/div/div/div[2]/h1"));
			String movie2 = movname2.getText();
			
			Thread.sleep(3000);				
			//Select About the movie and print it on console
			WebElement about2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/section[1]/section/span/div/span"));
			String aboutmovie2 = about2.getText();
			
			//Create a folder to print city name, movie name and about movie in text file
			File file = new File("D:\\BookMovieMiniProject");
			boolean m = file.mkdir();			System.out.println(m);
		
			//Create a file in BookMovieMiniProject Folder
			File TextFile = new File("D:\\BookMovieMiniProject\\ShowProject.txt");
			boolean b = TextFile.createNewFile();			System.out.println(b);
			String xyz = ("===========================================================================================================================================================");
			Set<String> se = new LinkedHashSet<String>();
			System.out.println("=============================================================================");
			se.add(city1);
			se.add(movie1);
			se.add(aboutmovie1);
			se.add(xyz);
			System.out.println("=============================================================================");			
			se.add(city11);
			se.add(movie11);
			se.add(aboutmovie11);
			se.add(xyz);
			System.out.println("=============================================================================");			
			se.add(city2);
			se.add(movie2);
			se.add(aboutmovie2);
			System.out.println("=============================================================================");
			se.forEach(t -> System.out.println(t));
			System.out.println("=============================================================================");
			FileUtils.write(TextFile, se.toString());
		}
		driver.close();
	}
}
