package HW1;

import java.util.Scanner;

public class baiTap4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("Nhập vào số thứ nhất: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gia trị cua chuỗi :");
        String chuoi = scanner.nextLine();
		
        
  // check độ dài chuỗi và số nhập
        if (chuoi.length() == a) {
			System.out.println("Chuỗi không thay đổi");
		} else if (chuoi.length() != a && chuoi.length() >a ) {
			System.out.println("Chuỗi thay đổi:\n" + chuoi.substring(0,a));
		}  else{
			
			System.out.println("Không thay đổi");
		}
       

 
	}
	}

