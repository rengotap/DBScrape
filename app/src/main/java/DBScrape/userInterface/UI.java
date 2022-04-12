package DBScrape.userInterface;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import DBScrape.Result;

public class UI {
    
    private static UI instance;
    private Scanner input;
    private Printer printer;

    private UI() {
        input = new Scanner(System.in);
        printer = Printer.getInstance();
    }

    public static UI getInstance() {
        if (instance == null) {
            instance = new UI();
        }
        return instance;
    }

    public void start() {
        System.out.println("Welcome to DBScrape");
        mainMenu();
    }

    private void mainMenu() {
        while(true) {
            clr();
            println("Welcome to DBScraper, your one stop for database scraping needs.");

            String params = promptString("Enter your search parameters");
            searchAll(params);
        }
    }

    private ArrayList<Result> searchAll(String params) {
        return new ArrayList<Result>();
        
    }

    private String promptString(String prompt) {
        print(prompt + "\n> ");
        String response = input.nextLine();

        return response;
    }

    /**
     * Clears the screen using ANSI
     * 
     * @author rengotap
     */
    private void clr() {
        print("\033[H\033[2J");
    }

    private void print(String string) {
        System.out.print(string);
    }

    private void println(String string) {
        System.out.println(string);
    }

}
