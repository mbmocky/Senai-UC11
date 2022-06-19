package gamemania;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TesteLoginGameMania {
	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Edgedriver\\msedgedriver.exe");
	    driver = new EdgeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	@Test
	public void TestarLogin() {
		driver.get("http://localhost:4200/");
		
		driver.findElement(By.linkText("Entrar")).click();
		
    	WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement inputSenha = driver.findElement(By.id("senha"));
		WebElement botao = driver.findElement(By.id("enviar"));
		
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//		
//		driver.findElement(By.id("enviar")).click();
		
	
		for(int tentativas = 0; tentativas < 3; tentativas++){
			try {
			
			inputEmail.clear();
			inputSenha.clear();
				
			inputEmail.sendKeys("teste@teste.com");
			inputSenha.sendKeys("batatafrita");
			botao.click();
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		WebElement mensagem = driver.findElement(By.id("mensagem"));
		
		System.out.println(mensagem.getText());
	}
}
