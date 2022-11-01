package HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baiTap2 {

	public static void main(String[] args) {
		 List<Integer> lists = new ArrayList<>();
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("Nhap so luong phan tu: ");
			int numberOfItem = scanner.nextInt();
			
			for (int i = 0; i < numberOfItem; i++) {
				System.out.println("Nhap phan tu thu " + i + " : ");
				int number = scanner.nextInt();
				lists.add(number);
			}
			
			System.out.println("cac phan tu trong list");
			int sum = 0;
			for (int i = 0; i < lists.size(); i++) {
				System.out.println(lists.get(i));
				sum = sum + lists.get(i);
			}
			System.out.println("Tong cac phan tu trong list: " + sum);

	}

}
