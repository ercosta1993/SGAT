/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgat;

import java.io.IOException;
import sgat.controller.SeleniumController;

/**
 *
 * @author 20413677
 */
public class MainApplication {
    public static void main(String[] args) throws IOException, InterruptedException {
        SeleniumController c = new SeleniumController();
        c.findByTrace(647541);
    }
}
