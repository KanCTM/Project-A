package HW1;

import java.util.Scanner;

public class baiTap1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 
         
        System.out.println("Nhập vào số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int secondNumber = scanner.nextInt();
        
        
        // Tính tổng
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
        
        // Check tổng
        if (tong % 2 == 0) {
			System.out.println(tong +" "+ "là số chẵn");
		} else  {
			System.out.println(tong +" "+ "là số lẻ");
		} 
	}

}
