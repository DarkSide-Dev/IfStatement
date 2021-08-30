import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age;
		
		System.out.println("Hey you, stop right there!\nThis place is for +18 only, how old are you?");
		age = scanner.nextInt();
		
		if(age >= 18) {
			
			System.out.println("Ok, you are allowed in");
			
		}
		else {
			
			System.out.println("NO, YOU'RE NOT ALLOWED IN");
			
		}
		
		scanner.close();

	}

}
