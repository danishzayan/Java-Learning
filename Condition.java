import java.util.Scanner;

class Condition {
	public static void main(String[] args) {

		int pwd;
		System.out.print("Enter password: ");
		Scanner Obj = new Scanner(System.in);

		pwd = Obj.nextInt();

		if(pwd == 2731) {
			System.out.println("My name: Danish Kamal");
			System.out.println("My age: 23");
		}
		else{
			System.out.println("Password is wrong...");
		}
		
	}
}