import java.util.*;
public class Guess {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100);
		System.out.println("I am thinking of a number between 1 and 100 (including both). What number am I thinking of?");
		System.out.print("Type a number: ");
		int guess = scan.nextInt();
		System.out.printf("Your guess was: %d \n", guess);
		System.out.printf("The number I was thinking of was: %d \n", num);
		System.out.printf("You were off by: %d \n", Math.abs(guess - num));
	}
}
