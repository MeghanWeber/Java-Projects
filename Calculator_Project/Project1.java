package project1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int correct = 0;
		int incorrect = 0;
		for (int j=0; j>-1; j++) { {
		System.out.println("Welcome to the Wright State School of Math!\r\n" + "Please choose one of the following options for your math quiz:\r\n" + 
				"1. Addition with numbers 1­10\r\n" + 
				"2. Addition with numbers 1­100\r\n" + 
				"3. Subtraction with numbers 1­10\r\n" + 
				"4. Subtraction with numbers 1­100\r\n" + 
				"5. Multiplication with numbers 1­10\r\n" + 
				"6. Exit the program ");
		int option = in.nextInt();
		
		for (int i=0; i<5; i++) {
		while (option == 1){
		int rand1 = (int)(1 + Math.random() * 10);
		int rand2 = (int)(1 + Math.random() * 10);
			System.out.println("Enter the answer to the following problem: " + rand1 + " + " + rand2);
			int answer1 = in.nextInt();
				if (answer1 == (rand1+rand2)) {
					System.out.println("That is the correct answer! ");
					correct = correct + 1;}
				else {
					System.out.println("Sorry that is the incorrect answer. the correct answer is " + (rand1+rand2));
					incorrect = incorrect + 1;}
			break;}
		while (option == 2){
		int rand3 = (int)(1 + Math.random() * 100);
		int rand4 = (int)(1 + Math.random() * 100);
			System.out.println("Enter the answer to the following problem: " + rand3 + " + " + rand4);
			int answer2 = in.nextInt();
				if (answer2 == (rand3+rand4)) {
					System.out.println("That is the correct answer! ");
					correct = correct + 1;}
				else {
					System.out.println("Sorry that is the incorrect answer. the correct answer is " + (rand3+rand4));
					incorrect = incorrect + 1;}
			break;}
		while (option == 3){
			int rand5 = (int)(1 + Math.random() * 10);
			int rand6 = (int)(1 + Math.random() * 10);
			System.out.println("Enter the answer to the following problem: " + rand5 + " - " + rand6);
			int answer3 = in.nextInt();
				if (answer3 == (rand5-rand6)) {
					System.out.println("That is the correct answer! ");
					correct = correct + 1;}
				else {
					System.out.println("Sorry that is the incorrect answer. the correct answer is " + (rand5-rand6));
					incorrect = incorrect + 1;}
				break;}
		while (option == 4){
			int rand9 = (int)(1 + Math.random() * 100);
			int rand10 = (int)(1 + Math.random() * 100);
			System.out.println("Enter the answer to the following problem: " + rand9 + " - " + rand10);
			int answer4 = in.nextInt();
				if (answer4 == (rand9-rand10)) {
					System.out.println("That is the correct answer! ");
					correct = correct + 1;}
				else {
					System.out.println("Sorry that is the incorrect answer. the correct answer is " + (rand9-rand10));
					incorrect = incorrect + 1;}
				break;}
		while (option == 5){
			option = 5;
			int rand7 = (int)(1 + Math.random() * 10);
			int rand8 = (int)(1 + Math.random() * 10);
			System.out.println("Enter the answer to the following problem: " + rand7 + " * " + rand8);
			int answer5 = in.nextInt();
				if (answer5 == (rand7*rand8)) {
					System.out.println("That is the correct answer! ");
					correct = correct + 1;}
				else {
					System.out.println("Sorry that is the incorrect answer. the correct answer is " + (rand7*rand8));
					incorrect = incorrect + 1;}
				break;}
		while  (option > 6 || option < 0 ){
			System.out.println("Valid choices are 1-6: please re-enter ");
			break;}
		while(option == 6) {
			DecimalFormat format = new DecimalFormat("0.00");
			int total = (incorrect + correct);
			double correctd = (double)correct*1.00;
			double totald = (double)total*1.00;
			double finalScore = (correctd/totald)*100.00;
			double finalFinal = (double)(finalScore*100/100.00);
			System.out.println("You got " +  correct + " problems out of " + total + " that is " + finalFinal + " percent correct. Goodbye!");
			j=-2;
			i=5;
			break;}
			}}}
		
	
		in.close();
		}}