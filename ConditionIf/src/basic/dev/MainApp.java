package basic.dev;

import java.util.Scanner;
import java.lang.Math;
public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Nhập vào 1 số nguyên. Kiểm tra số đó nguyên dương hay nguyên âm.
		System.out.println("Nhap vao so nguyen a: ");
		int a;
		a = sc.nextInt();
		if (a > 0) {
			System.out.println("\nSo nguyen tren la so nguyen duong! ");
		} else if (a < 0) {
			System.out.println("\nSo nguyen tren la so nguyen am! ");
		} else {
			System.out.println("\n So nguyen tren khong phai la so nguyen duong hay am! ");
		}
		
		// Nhập vào số nguyên n. Kiểm tra xem n chia hết cho 3 hay 5
		System.out.println("Nhap vao so nguyen n: ");
		int n;
		n = sc.nextInt();
		if ((n % 3 != 0)&& (n % 5 != 0)) {
			System.out.println("n ko chia het cho 1 trong hai 3 va 5");
		} else {
			System.out.println("n chia het cho 1 trong hai va 5");
		}
		
		// Nhập vào tháng trong năm. In ra số ngày của tháng 
		System.out.println("Nhap vao thang");
		int month;
		month = sc.nextInt();
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("Thang nay co 31 ngay");
				break;
		case 4, 6, 9, 11:
			System.out.println("Thang nay co 30 ngay");
				break;
		case 2: 
			System.out.println("Thang nay co 28 hoac 29 ngay");
				break;
		default:
			System.out.println("Nhap thang khong dung! ");
		}
		
		// Giai phuong trinh bac 2
		
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		System.out.println("Nhap c: ");
		int c = sc.nextInt();
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh co vo so nghiem! ");
				} else {
					System.out.println("Phuong trinh vo nghiem! ");
				}
			} else {
				float x = -b/c;
				System.out.format("Phuong trinh co nghiem x = %.2f", x).println();
			}
		} else {
			float delta = b*b-4*a*c;
			if (delta >= 0) {
				double x1 = (-b + Math.sqrt(delta))/2*a;
				double x2 = (-b - Math.sqrt(delta))/2*a;
				if (x1 == x2) {
					System.out.format("Phuong trinh co nghiem kep la x = %.2f", x1).println();
				} else {
					System.out.format("Phuong trinh co 2 nghiem x1 = %.2f va x2 = %.2f",x1,x2).println();
				} 
			} else {
				System.out.println("Phuong trinh vo nghiem! ");
			}
		}
		
		// Nhap vao 3 so nguyen. Kiem tra xem co phai la do dai 3 canh cua tam giac khong
		System.out.println("Nhap vao so a: ");
		float i = sc.nextFloat();
		System.out.println("Nhap vao so b: ");
		float j = sc.nextFloat();
		System.out.println("Nhap vao so c: ");
		float k = sc.nextFloat();
		if ((i>= 0) && (j>=0) &&(k>= 0)) {
			if (((i + j) > k ) && ((j + k ) > i ) && ((i + k) > j)) {
				System.out.println("a b c la ba canh tam giac");
			} else {
				System.out.println("a b c khong phai la ba canh tam giac");
			}
		} else {
			System.out.println("Nhap sai gia tri a b c! ");
		}
		
	}
}	
