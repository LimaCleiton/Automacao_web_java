package bdd.compras;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://lojaebac.ebaconline.art.br/");
		driver.manage().window().maximize();

	}

	public void escolherProduto() {

		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/figure/a/img[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-2559\"]/div[1]/div[2]/div/form/table/tbody/tr[1]/td[2]/ul/li[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-2559\"]/div[1]/div[2]/div/form/table/tbody/tr[2]/td[2]/ul/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-2559\"]/div[1]/div[2]/div/form/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"tbay-header\"]/div[2]/div/div/div/div[2]/div/form/div/div/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"tbay-header\"]/div[2]/div/div/div/div[2]/div/form/div/div/input[1]")).sendKeys("geo");
		driver.findElement(By.xpath("//*[@id=\"tbay-header\"]/div[2]/div/div/div/div[2]/div/form/div/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"product-2934\"]/div[1]/div[2]/div/form/table/tbody/tr[1]/td[2]/ul/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-2934\"]/div[1]/div[2]/div/form/table/tbody/tr[2]/td[2]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"product-2934\"]/div[1]/div[2]/div/form/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/div/div/a")).click();

	}

	public void validarProdutos() {


		driver.quit();

	}

}
