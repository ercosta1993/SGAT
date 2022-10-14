/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgat.controller;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author 20413677
 */
public class SeleniumController {

    private String url;
    private String login;
    private String password;
    private WebDriver navigation;

    private String demandaPai;
    private String solicitante;
    private String ramal;
    private String centroCusto;
    private String predio;
    private String bloco;
    private String sala;
    private String unidade;

    public SeleniumController(String login, String password, String trace) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src\\sgat\\webdriver\\chromedriver.exe");
        navigation = new ChromeDriver();
        navigation.get("https://portalservicos.pucrs.br/TraceGP/Demanda.do?idFormulario=5&tipoTelaDemanda=todasDemandas&command=popupDemandaAction&idDemanda=" + trace + "&idModelo=null&tituloFormulario=null&tituloDemanda=0&idAgilUserStory=undefined");
        navigation.findElement(By.xpath("//*[@id=\"txtUsuario\"]")).sendKeys(login);
        navigation.findElement(By.xpath("//*[@id=\"pwdSenha\"]")).sendKeys(password);
        navigation.findElement(By.xpath("//*[@id=\"botaoAcessarLogin\"]")).click();
        TimeUnit.SECONDS.sleep(1);
        this.demandaPai = navigation.findElement(By.xpath("//*[@id=\"txtTituloDemandaPai\"]")).getAttribute("value").substring(1, 7);
        navigation.get("https://portalservicos.pucrs.br/TraceGP/Demanda.do?idFormulario=5&tipoTelaDemanda=todasDemandas&command=popupDemandaAction&idDemanda=" + demandaPai + "&idModelo=null&tituloFormulario=null&tituloDemanda=0&idAgilUserStory=undefined");
        TimeUnit.SECONDS.sleep(1);
        this.solicitante = navigation.findElement(By.xpath("//*[@id=\"solicitante\"]")).getAttribute("value");
        TimeUnit.SECONDS.sleep(1);
        this.ramal = navigation.findElement(By.xpath("//*[@id=\"atributo_T_47\"]")).getAttribute("value");
        TimeUnit.SECONDS.sleep(1);
        String[] array = navigation.findElement(By.xpath("//*[@id=\"labeluo\"]")).getAttribute("value").split(" ");
        TimeUnit.SECONDS.sleep(1);
        this.predio = navigation.findElement(By.xpath("//*[@id=\"cmb_atributo_X_252_nivel1\"]")).getAttribute("value").replace("C - PREDIO ", "");
        TimeUnit.SECONDS.sleep(1);
        this.bloco = navigation.findElement(By.xpath("//*[@id=\"cmb_atributo_X_252_nivel2\"]")).getAttribute("value").split(" ")[1];
        TimeUnit.SECONDS.sleep(1);
        this.sala = navigation.findElement(By.xpath("//*[@id=\"cmb_atributo_X_252_nivel3\"]")).getAttribute("value");
        TimeUnit.SECONDS.sleep(1);
        this.unidade = navigation.findElement(By.xpath("//*[@id=\"atributo_T_449\"]")).getAttribute("value");

        System.out.println(demandaPai);
        System.out.println(solicitante);
        System.out.println(ramal);
        System.out.println(getCentroCusto(array));
        System.out.println(predio);
        System.out.println(bloco);
        System.out.println(sala);
        System.out.println(unidade);

        navigation.close();
    }

    public String getDemandaPai() {
        return demandaPai;
    }

    public void setDemandaPai(String demandaPai) {
        this.demandaPai = demandaPai;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getCentroCusto(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumeric(array[i])) {
                this.centroCusto = array[i];
            }
        }
        return centroCusto;
    }

    public boolean isNumeric(String strNum) {
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

    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WebDriver getNavigation() {
        return navigation;
    }

    public void setNavigation(WebDriver navigation) {
        this.navigation = navigation;
    }
}
