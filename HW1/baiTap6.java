package HW1;

import java.util.Scanner;

public class baiTap6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        
		System.out.print("Vui long nhap chuỗi:");
		String chuoi = scanner.nextLine();
		
        
        // Trim() khoảng trắng
		chuoi = chuoi.trim();
        System.out.println("Chuỗi:\n" + chuoi.replaceAll("\\s+"," "));
     
		

	}

}
