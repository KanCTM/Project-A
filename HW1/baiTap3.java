package HW1;

import java.util.Scanner;

public class baiTap3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Vui long nhap chuỗi:");
		String chuoi = scanner.nextLine();
		
	// check độ dài chuỗi
		if (chuoi.length() != 10 && chuoi.length() > 10) {
			System.out.println("Chuỗi in hoa:"+chuoi.toUpperCase());
		} else if (chuoi.length() ==10 || chuoi.length() < 10 ) {
			System.out.println("Chuỗi in thường:" +chuoi.toLowerCase());
		}  else{
			
			System.out.println("Else");
		}
	}
	}


