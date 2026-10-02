import java.util.*;
public class Seconds {
	
	public static void main(String[] args) {
		final int SEC_PER_MIN = 60;
		final int MIN_PER_HOUR = 60;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a time in seconds: ");
		int iseconds = scan.nextInt();
		int seconds = iseconds % SEC_PER_MIN;
		int minutes = iseconds / SEC_PER_MIN;
		int hours = minutes / MIN_PER_HOUR;
		minutes = minutes % MIN_PER_HOUR;
		System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", iseconds, hours, minutes, seconds);
	}
}
