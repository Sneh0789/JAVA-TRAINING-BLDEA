package bldea;
import java.util.Scanner;
public class Prog15{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		if (age<18)
		{
			System.out.println("you are still minor.please grow up!!");
		}
		else if (age>65)
		{
			System.out.println("you are a senior citizen.stop over expectations");
		}
		else {
			System.out.println("congratulation you are in the list of groom");
		}
		}
}

