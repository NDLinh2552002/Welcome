package giaiphuongtrinhbac2;
import java.util.Scanner;
public class GiaiPhuongTinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a (a # 0): ");
        a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        c = scanner.nextDouble();
        delta = Math.pow(b, 2) - 4 * a * c;// tính delta = b * b - 4 * a * c;
        if (delta < 0) {
        	System.out.println("PTVN");
        } else if (delta == 0) {
            x1 = x2 = -b/ (2*a);
            System.out.println("phuong trinh co nghiem kep la: x1 = x2 = "+x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem la: x1 = " + x1 + " va x2 = " + x2);
        }
        
	}

}
