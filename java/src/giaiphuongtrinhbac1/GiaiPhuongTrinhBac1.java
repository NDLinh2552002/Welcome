package giaiphuongtrinhbac1;
import java.util.Scanner;
public class GiaiPhuongTrinhBac1 {

	public static void main(String[] args) {
		System.out.println("nhap phuong trinh ax + b = y ");
		System.out.println("nhap a: ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("nhap b: ");
		int b=sc.nextInt();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co vo so nghiem.");
			} else {
				System.out.println("Phuong trinh vo nghiem.");
			}
		} else {
			System.out.println("Phuong trinh co nghiem la:  " +(double) -b/ a );
		}
		
	}

}
