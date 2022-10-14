/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgat.controller;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author 20413677
 */
public class SeleniumController {

    public void findByTrace(int trace) throws InterruptedException {
        ArrayList<String> resultados = new ArrayList<>();

        try {
            System.setProperty("webdriver.chrome.driver", "src\\sgat\\webdriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //ChromeOptions options = new ChromeOptions();
            //options.setHeadless(true);
            //WebDriver driver = new ChromeDriver(options);
            //entra na demanda direto
            driver.get("https://portalservicos.pucrs.br/TraceGP/Demanda.do?idFormulario=5&tipoTelaDemanda=todasDemandas&command=popupDemandaAction&idDemanda=" + String.valueOf(trace) + "&idModelo=null&tituloFormulario=null&tituloDemanda=0&idAgilUserStory=undefined");
            driver.findElement(By.xpath("//*[@id=\"txtUsuario\"]")).sendKeys("20413677");
            driver.findElement(By.xpath("//*[@id=\"pwdSenha\"]")).sendKeys("rick@1959");
            driver.findElement(By.xpath("//*[@id=\"botaoAcessarLogin\"]")).click();
            TimeUnit.SECONDS.sleep(2);
            String demandaPai = driver.findElement(By.xpath("//*[@id=\"txtTituloDemandaPai\"]")).getAttribute("value").substring(1, 7);
            TimeUnit.SECONDS.sleep(1);
            String responsavel = driver.findElement(By.xpath("//*[@id=\"solicitante\"]")).getAttribute("value");
            TimeUnit.SECONDS.sleep(1);
            String descricaoSetor = driver.findElement(By.xpath("//*[@id=\"atributo_T_451\"]")).getAttribute("value");
            TimeUnit.SECONDS.sleep(1);
            String predio = driver.findElement(By.xpath("//*[@id=\"cmb_atributo_X_252_nivel1\"]")).getAttribute("value");
            TimeUnit.SECONDS.sleep(1);
            String bloco = driver.findElement(By.xpath("//*[@id=\"cmb_atributo_X_252_nivel2\"]")).getAttribute("value");
            TimeUnit.SECONDS.sleep(1);
            String sala = driver.findElement(By.xpath("//*[@id=\"cmb_atributo_X_252_nivel3\"]")).getAttribute("value");
            TimeUnit.SECONDS.sleep(1);
            
            driver.get("https://portalservicos.pucrs.br/TraceGP/Demanda.do?idFormulario=5&tipoTelaDemanda=todasDemandas&command=popupDemandaAction&idDemanda=" + demandaPai + "&idModelo=null&tituloFormulario=null&tituloDemanda=0&idAgilUserStory=undefined");
            
            TimeUnit.SECONDS.sleep(2);
            String solicitante = driver.findElement(By.xpath("//*[@id=\"solicitante\"]")).getAttribute("value");
            TimeUnit.SECONDS.sleep(1);
            String centroCusto = driver.findElement(By.xpath("//*[@id=\"labeluo\"]")).getAttribute("value");
            System.out.println("Demanda Pai: " + demandaPai);
            System.out.println("Responsável: " + responsavel);
            System.out.println("Centro de Custo: " + getCentroCusto(centroCusto));
            System.out.println("DescricaoSetor: " + descricaoSetor);
            System.out.println("Predio: " + predio.replace("C - PREDIO ", "").replace("S - PREDIO ", "").replace("V - PREDIO ", ""));
            System.out.println("Bloco: " + bloco.replace("BL. ", "").charAt(0));
            System.out.println("Sala: " + sala);
            System.out.println("Solicitante: " + solicitante);
            driver.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de requisição");
        }
    }

    public String getCentroCusto(String input) {
        String[] array = input.split(" ");
        String output = "";
        for (int i = array.length - 1; i > 0; i--) {
            if (isNumeric(array[i])) {
                output = array[i];
                break;
            }
        }
        return output;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
