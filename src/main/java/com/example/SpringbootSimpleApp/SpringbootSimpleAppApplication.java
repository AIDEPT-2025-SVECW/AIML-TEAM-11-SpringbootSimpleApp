package com.example.SpringbootSimpleApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.time.Year;

@SpringBootApplication
public class SpringbootSimpleAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSimpleAppApplication.class, args);
	}

	
    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Age Calculator!!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
		scanner.close();
    }
}
