import java.util.Scanner;

public class IO {
	public static void main(String[] args) {

		int a,b,c;
		System.out.print("Enter any two number: ");

		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = a + b;

		System.out.print("Sum of two nubmer: " + c);
	}
}