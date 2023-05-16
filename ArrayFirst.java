import java.util.Scanner;

class ArrayFirst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] anArray = new int[10];
		System.out.println("Enter the 10 number for storing array: ");

		for(int i=0; i<10; i++) {
			anArray[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++) {
			System.out.println("index of Array " + i + "= " + anArray[i]);
		}
	}
}