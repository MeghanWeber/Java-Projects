package project3;

//Meghan Weber

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int menuOption = getMenuOption();
			File file;
			int key;
			switch (menuOption) {
			case 1:
				file = getTxtFile();
				key = getKey();
				encrypt(file, key);
				break;
			case 2:
				file = getEncFile();
				key = getKey();
				decrypt(file, key);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Not a valid option");
				continue;
			}
		}

	}
// method for getting the textfile
	public static File getTxtFile() {
		String fileName;
		while (true) {
			System.out.print("Enter file name: ");
			fileName = in.nextLine();
			if (fileName.endsWith(".txt")) {
				return new File(fileName);
			}
			System.out.println("File is not a .txt file");
		}
	}
//method for ecrypting the files
	public static File getEncFile() {
		String fileName;
		while (true) {
			System.out.print("Enter file name: ");
			fileName = in.nextLine();

			if (fileName.endsWith(".enc")) {
				return new File(fileName);
			}
			System.out.println("File is not a .enc file");
		}
	}
// method for getting the number that each digit will be shifted by
	public static int getKey() {
		int key;
		System.out.print("Enter a key value: ");
		key = in.nextInt();
		return key;
	}
// Menu that will promt the user to either encrypt, decrypt or exit the program
	public static int getMenuOption() {
		// Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. Encrypt");
			System.out.println("2. Decrypt");
			System.out.println("3. Quit");
			System.out.print("What would you like to do? ");
			int menu_option = in.nextInt();
			if (menu_option == 1 || menu_option == 2 || menu_option == 3) {
				// in.close();
				in.nextLine();
				return menu_option;
			}
			System.out.println("invalid input");
		}
	}
// method for encrypting the text file
	public static void encrypt(File inputFile, int key) throws Exception {
		String outputFile = inputFile.getName();
		System.out.println(outputFile);
		outputFile = outputFile.substring(0, outputFile.length() - 4) + ".enc";
		// this successfully creates the textfile but for some reason does not show 
		// in the package explorer-- dont know why but it does work!!
		Scanner fileIn = new Scanner(inputFile);
		PrintWriter fileOut = new PrintWriter(new File(outputFile));
		fileOut.flush();
		while (fileIn.hasNext()) {
			String input = fileIn.next();
			System.out.println(input);
			char[] inputArray = input.toCharArray();
			for (int i = 0; i < inputArray.length; i++) {
				System.out.println((char) (inputArray[i] + key));
				fileOut.print((char) (inputArray[i] + key));
			}
			fileOut.println();
		}
		fileIn.close();
		fileOut.close();

	}
// method for decrypting the text file
	public static void decrypt(File inputFile, int key) throws Exception {
		String outputFile = inputFile.getName();
		System.out.println(outputFile);
		outputFile = outputFile.substring(0, outputFile.length() - 4) + ".txt";

		Scanner fileIn = new Scanner(inputFile);
		PrintWriter fileOut = new PrintWriter(new File(outputFile));
		fileOut.flush();
		while (fileIn.hasNext()) {
			String input = fileIn.next();
			System.out.println(input);
			char[] inputArray = input.toCharArray();
			for (int i = 0; i < inputArray.length; i++) {
				System.out.println((char) (inputArray[i] - key));
				fileOut.print((char) (inputArray[i] - key));
			}
			fileOut.println();
		}
		fileIn.close();
		fileOut.close();

	}

}
