package br.com.deisesales.rpa.service;

import br.com.deisesales.rpa.entidades.Usuario;
import br.com.deisesales.rpa.entidades.Navegador;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class Automatizacao {

    public void executar() {

        Navegador navegador = new Navegador();
        Usuario usuario = new Usuario();

        // Configura qual é o caminho do driver
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();

        // Recebe e acessa a URL
        driver.get(navegador.getUrl());

        try {
            // Recebe e acessa a URL
            driver.get(navegador.getUrl());

            // Encontra o campo e digita o e-mail
            WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
            email.clear();
            email.sendKeys(usuario.getUsuario());

            // Clica no botão verificar
            WebElement botaoVerificar = driver.findElement(By.cssSelector("button[type='submit']"));
            botaoVerificar.click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

            // Recebe a URL atual e acessa
            driver.getCurrentUrl();

            // Encontra o campo e digita o senha
            WebElement senha = driver.findElement(By.cssSelector("input[type='password']"));
            senha.sendKeys(usuario.getSenha());

            // Clica no botão verificar
            WebElement botaoEntrar = driver.findElement(By.cssSelector("button[type='submit']"));
            botaoEntrar.click();

            // encerra o navegador
            driver.quit();

        } catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro na classe automatização, erro: " + e.getMessage());
        }

    }
}
