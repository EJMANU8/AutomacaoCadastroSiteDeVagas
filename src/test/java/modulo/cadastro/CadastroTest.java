package modulo.cadastro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Teste para cadastro de ususario")
public class CadastroTest {

    @Test
    @DisplayName("crear usuario seguindo as regras de negocio")
    public void testeDeCadastroDeUsuarioInformacaoValida() {

        //Abrir navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegdor = new ChromeDriver();

        //Maximixar tela
        navegdor.manage().window().maximize();

        //Navegar no site vagas.com
        navegdor.get("https://www.vagas.com.br/cadastrar-curriculo");

        //Fazer cadastro
        navegdor.findElement(By.cssSelector("input[name= 'email']")).click();
        navegdor.findElement(By.cssSelector("input[ data-testid= 'input-email']")).sendKeys("suarezunesr07@gmail.com");

        navegdor.findElement(By.name("password")).click();
        navegdor.findElement(By.cssSelector("input[ name= 'password']")).sendKeys("Tripulante1");

        navegdor.findElement(By.name("cpf")).click();
        navegdor.findElement(By.cssSelector("input[ name= 'cpf']")).sendKeys("1234561265");

        navegdor.findElement(By.name("agree")).click();
        navegdor.findElement(By.cssSelector("button[ type= \"submit\" ]")).click();

    }
}
