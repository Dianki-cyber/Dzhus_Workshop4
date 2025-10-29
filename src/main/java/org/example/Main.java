package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership("Dream Motors", "501 Luxury Ave","512-777-7777");

        UserInterface userInterface= new UserInterface();
        userInterface.start();

    }


}
