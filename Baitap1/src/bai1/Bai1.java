package bai1;
import java.util.Scanner;
public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2;
		Scanner sc = new Scanner(System.in);
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		if(number1 < number2) {
			System.out.println("nhap lai");
		 }
		else {
			System.out.print("What is " +number1);System.out.println("-" +number2);
			
		}
		
		
	}

}
