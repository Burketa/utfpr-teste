//Importar as libs e o selenium sem .src

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author PauloAugusto
 */
public class ChromeTest {

    //@Ignore
    @Test
    public void test00() {
        //Configurar webdriver -> relacionar o chromedriver como webdriver, colocar o caminho do driver
        System.setProperty("webdriver.chrome.driver", "C:/Users/Aluno/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Casi nao seja possivel acessar o elemento, espere x segundos e tente novamente
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Acessar o site
        driver.get("https://imobiliariakasacerta.com.br/property/ref-2080-barracao-rua-antonio-braga-n-09-jardim-primavera/");

        //Nome do elemento que queremos pegar
        WebElement myName = driver.findElement(By.name("your-name"));
        System.out.println(myName);
        WebElement myEmail = driver.findElement(By.name("your-email"));
        WebElement myPhone = driver.findElement(By.name("tel-222"));
        WebElement myMsg = driver.findElement(By.name("your-message"));
        WebElement submitButton = driver.findElement(By.cssSelector("input[class='wpcf7-form-control wpcf7-submit']"));

        //Digite isso nos campos e envie
        myName.sendKeys("utfpr");
        myEmail.sendKeys("teste-de-software@utfpr.edu.br");
        myPhone.sendKeys("0000000000");
        myMsg.sendKeys("so pela zuera mesmo");
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                WebElement response = driver.findElement(By.cssSelector("div[class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok']"));
                return response != null;
            }
        });

        boolean response = driver.findElement(By.cssSelector("div[class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ok']")) != null;
        assertTrue(response);
        driver.close();
    }

    @Ignore
    @Test
    public void test01() {
        //Configurar webdriver -> relacionar o chromedriver como webdriver, colocar o caminho do driver
        System.setProperty("webdriver.chrome.driver", "C:/Users/Aluno/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Casi nao seja possivel acessar o elemento, espere x segundos e tente novamente
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Acessar o google
        driver.get("https://www.google.com.br/");
        //Nome do elemento que é o campo de texto do google que queremos pegar
        WebElement searchInput = driver.findElement(By.name("q"));
        //Digite isso no campo
        searchInput.sendKeys("teste de software");
        searchInput.submit();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("teste");
            }
        });
        assertTrue(driver.getTitle().startsWith("teste de software"));
        driver.close();
    }

    @Ignore
    @Test
    public void test02() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Aluno/Desktop/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        driver.get("https://www.gmail.com/");

        //colocar o nome do usuário
        WebElement username = driver.findElement(By.name("identifier"));
        username.sendKeys("paulonardiicmc@gmail.com");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        /*
        //colocar a senha
        WebElement senha = driver.findElement( By.name("pass") );
        senha.sendKeys("lala1212");
         */
        //username.submit();
        WebElement botao = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        botao.click();

        //colocar o nome do usuário
        WebElement senha = driver.findElement(By.name("password"));
        wait1.until(ExpectedConditions.elementToBeClickable(senha));

        senha.sendKeys("lala1212");

        WebElement botao2 = driver.findElement(By.id("passwordNext"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        botao2.click();

        WebElement resposta = driver.findElement(By.xpath("//*[contains(text(), 'Senha incorreta')]"));
        assertTrue(resposta.getText().startsWith("Senha incorreta"));

        driver.close();
    }

    @Ignore
    @Test
    public void test03() {
        System.setProperty("webdriver.chrome.driver", "D:/documentos/googledriveNuvem/trabalhoNuvem/2019_2/TesteDeSoftware/aulas/selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        driver.get("https://www.gmail.com/");

        //colocar o nome do usuário
        WebElement username = driver.findElement(By.name("identifier"));
        username.sendKeys("testedesoftwareutfpr@gmail.com");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement botao = driver.findElement(By.xpath("//span[contains(text(), 'Próxima')]"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        botao.click();

        //colocar o nome do usuário
        WebElement senha = driver.findElement(By.name("password"));
        wait1.until(ExpectedConditions.elementToBeClickable(senha));

        senha.sendKeys("lala1212.");

        WebElement botao2 = driver.findElement(By.id("passwordNext"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        botao2.click();

        WebElement resposta = driver.findElement(By.xpath("//*[contains(text(), 'Inbox')]"));
        assertTrue(resposta.getText().startsWith("Inbox"));

        driver.close();
    }

}
