package Fabbi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		// Vòng lặp theo index
//		System.out.println("Vòng lặp tăng dần");
//		for (int i = 0; i < 9; i++) {
//			System.out.println("Gia tri cua i: " + i);
//
//			// continue: bỏ qua với giá trị đó
//			if (i == 5) {
//				continue;
//			// break: sẽ dừng và ko chạy tiếp ở giá trị quy định
//			} else if (i == 7) {
//				break;
//			}else {
//				System.out.println("Gia tri cua i: " + i);
//			}
//		}
//
//		System.out.println("Vòng lặp giảm dần");
//		for (int i = 9; i >= 0; i--) {
//			System.out.println("Gia tri cua i: " + i);
//		}

		// Chuỗi
		List<String> lists = new ArrayList<>();

//		// add phần tử vào trong chuỗi
//		lists.add("ABC");
//		lists.add("DEF");
//		lists.add("GHI");
//		lists.add("KML");

		
		
		// TH không có index++ thì nó sẽ chỉ dừng đến thằng đã quy định, TH có index++
		// thì nó sẽ chạy hết list và bỏ qua giá trị quy định
//		int index =0;
//		for (String item : lists) {
//			System.out.println("Giá trị index: " + index);
//			
//			if(index==2) {
//				index++;
//				continue;
//			}
//			System.out.println(item);
//			index++;
//		}

		
		
//		//Check item bằng với giá trị cụ thể
//		for (String item : lists) {
//			if(item.equals("DEF")) {
//				continue;
//			}
//			System.out.println(item);
////			index++;
//		}
//		

		// Check chuỗi bằng cách nhập từ bàn phím
		System.out.print("Số lượng phần tử: ");
		int numberOfItem = scanner.nextInt();
		System.out.println();
		scanner.nextLine();
		
		for (int i = 0; i<numberOfItem; i++ ) {
			System.out.print("Nhập phần tử thứ "+ i + " :");
			String item =scanner.nextLine();
			lists.add(item);	
			System.out.println();
		} 
		 
	
//		for (String item: lists) {
//			System.out.println(item);
//		}
		
		//check theo size phải lớn hơn số size không sẽ báo lỗi TH <=, chạy từ 0
		for (int i =0; i< lists.size(); i++) {
			String item = lists.get(i);
			System.out.println(item);
		}
		
		
		// check theo trường hợp giảm dần, in ngược lại giá trị nhập vào
		System.out.println();
		for (int i =lists.size() -1; i>=0; i--) {
			String item = lists.get(i);
			System.out.println(item);
		}

		
		
		// Check theo vòng while: lặp đến khi index < listSize vẫn còn đúng ( tăng dần)
		int listSize = lists.size();
		int index = 0;
		
		while (index < listSize) {
			String item = lists.get(index);
			System.out.println(item);
			index++;
		}
		
		
		// Check theo vòng while giảm dần
		int indexGiamdan = lists.size() -1;
		while (indexGiamdan>=0) {
			String item = lists.get(indexGiamdan);
			System.out.println(item);
			indexGiamdan--;
		}
		
		
		scanner.close();
	
	}

}
