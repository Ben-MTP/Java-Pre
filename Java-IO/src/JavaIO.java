import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaIO {

	public static void main(String[] args) throws FileNotFoundException {
		int a, b, c;
		Scanner sc = new Scanner(new File("input.txt"));
		
		System.out.println("Enter a: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
