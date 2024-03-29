package numguess;

import java.util.Random;
import java.util.Scanner;

public class NumGuess {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in); 
		
		int solution = 1 + random.nextInt(100);
		int answer = 0;
		
		do {
			answer = scanner.nextInt();

			if (answer == solution) {
				System.out.println("Correct.");
			} else if (answer > solution) {
				System.out.println("Too high.");
			} else {
				System.out.println("Too low.");
			}
		} while(answer != solution);
	}
}
