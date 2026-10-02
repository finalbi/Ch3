import java.util.*;
public class Celsius{ 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a temperature in celsius: ");
		double Ctemp = scan.nextDouble();
		double Ftemp = Ctemp * 1.8 + 32;
		System.out.printf("%.1f C = %.1f F", Ctemp, Ftemp);
	}
}

