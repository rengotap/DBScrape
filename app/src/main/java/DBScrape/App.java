/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DBScrape;

import DBScrape.userInterface.UI;

public class App {
    private static UI ui;

    public static void main(String[] args) {
        ui = UI.getInstance();
        ui.start();  
    }
}
