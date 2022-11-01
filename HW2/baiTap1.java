package HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baiTap1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> lists = new ArrayList<>();
		System.out.print("Số lượng phần tử: ");

		int numberOfItem = scanner.nextInt();
		System.out.println();
		scanner.nextLine();

		for (int i = 0; i < numberOfItem; i++) {
			System.out.println("NHap phan tu thu " + i + " : ");
			int number = scanner.nextInt();
			lists.add(number);
		}
		int max = lists.get(0);
		for (int i = 1; i < lists.size(); i++) {
			if (max < lists.get(i)) {
				max = lists.get(i);
			}
		}
		int min = lists.get(0);
		for (int i = 1; i < lists.size(); i++) {
			if (min > lists.get(i)) {
				min = lists.get(i);
			}
		}
		System.out.println("Phan tu lon nhat la:" + max);
		System.out.println("Phan tu nho nhat la:" + min);

	}

}
