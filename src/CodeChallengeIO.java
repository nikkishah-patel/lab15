import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CodeChallengeIO {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String directory = "Employees";
		createDirectory(directory);
		createFile(directory, "aboutEmployees.txt");
		writeToFile(directory, "aboutEmployees.txt");
		

	
}
	public static void createDirectory(String dirString) {

		Path dirPath = Paths.get(dirString);

		// this will only execute if the file is not there
		if (Files.notExists(dirPath)) {
			try {
				Files.createDirectories(dirPath);
			} catch (IOException e) {
				System.out.println("I'm not sure what happened, contact customer service");
			}
		}

	}

	public static void createFile(String dirString, String fileString) {

		// if you don't want this to go into a folder just use the get method taking in
		// one parameter for the filename
		// use the overloaded get method if you want to add a file inside of a folder
		Path filePath = Paths.get(dirString, fileString);

		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("Your file was created successfully");
			} catch (IOException e) {
				System.out.println("Hey, something went wrong with the file creation");
			}
		}
	}
	public static void writeToFile(String dirString, String fileString) {
		
		String favoriteFood;
		String name;
		int age;
		Employees emp;
		String cont;
		Scanner scnr = new Scanner(System.in);
		
		Path writeFile = Paths.get(dirString, fileString);

		File file = writeFile.toFile(); // the toFile() converts the path to a file object

		try {
			
			do {
				System.out.println("Employee name: ");
				name = scnr.nextLine();
				System.out.println("Employee age: ");
				age = scnr.nextInt();
				System.out.println("Employee favorite food: ");
				favoriteFood = scnr.nextLine();
				
				emp = new Employees(name, age, favoriteFood);	
				
				PrintWriter printOut = new PrintWriter(new FileOutputStream(file, true));
				printOut.println(emp);
				printOut.close(); // closing flushes our data and closes the PrintWriter (object)
				
				System.out.print("Would you like to add another employee? (y/n): ");
				cont = scnr.nextLine();
				} while (cont.equalsIgnoreCase("Y"));
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
	}
}