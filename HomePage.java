package br.senai.sp.automacaoteste;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HomePage {
	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Edgedriver\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegarParaGoogle() {
	    driver.get("https://online.sp.senai.br/");
	    
	    WebElement input = driver.findElement(By.id("Busca1_txtFiltro"));
	    
	    driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gestão");
	    driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
	}
}
