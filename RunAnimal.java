/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jhnnn
 */
import java.util.Scanner;

public class RunAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = scanner.nextLine();

        Animal animal = null;

        if (choice.equalsIgnoreCase("B")) {
            animal = new Bird();
        } else if (choice.equalsIgnoreCase("C")) {
            animal = new Cat();
        } else if (choice.equalsIgnoreCase("D")) {
            animal = new Dog();
        } else {
            System.out.println("Invalid choice. Please try again.");
            scanner.close();
            return; 
        }

        animal.eat();
        animal.sleep();
        animal.makeSound();

        scanner.close(); 
    }
}