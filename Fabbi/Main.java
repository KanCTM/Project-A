package Fabbi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final int case1 = 0;

	public static void main(String[] args) {
//		//khai báo biến và kiểu dữ liệu
//		int  a= 10;
//		float b = 10f;
//		String c = "Hello Word";
//		System.out.println(a);
//		System.out.println(a);
//
//		//khai báo scanner để nhập giữ liệu từ bàn phím
//		Scanner scanner = new Scanner(System.in);
//		//Nhập giá trị mong muốn
//		System.out.print("Vui long nhap gia tri bien a:");
//		//Nhập dữ liệu cho biến a từ bàn phím
//		a = scanner.nextInt();
//		//Trường hợp nhập là số cần thêm Line để nội dung dưới có thể nhập bình thường
//		scanner.nextLine();
//		System.out.println("Gia trị cua bien a la:"+a);
//		
//		//Nhập giá trị mong muốn
//		System.out.println("Gia trị cua bien d la:");
//		//Nhập giá trị chuỗi d từ bàn phím
//		String d = scanner.nextLine();
//		System.out.println("Gia trị cua bien d la:"+d);
//
//		
//		
//		
//		//Khai báo kiểu array
//		int[] tapHopSoNguyen = {1,3,6,9};
//		//khai báo List
//		List<String> tapHopChuoi = new ArrayList<>();
//		//add thêm phần tử vào list
//		tapHopChuoi.add("abc");
//		tapHopChuoi.add("def");
		
		
		//Khai báo biến(lấy kết quả đúng)
		int soChia = 10;
		int soBiChia = 100;
		int ketQuaChiaHet = soBiChia / soChia;
		int ketQuaChiaDu = soBiChia % soChia;
		
		System.out.println("Kết quả:"+ketQuaChiaHet);
		System.out.println("Kết quả:"+ketQuaChiaDu);
		
		if (ketQuaChiaHet>12) {
			System.out.println("Thoa man dk if");	
		}
		
		//kiểm tra length của 1 chuỗi
		String chuoi ="Hello";
		System.out.println("Do dai chuoi: "+ chuoi.length());
		
		if (chuoi.length() != 5 && chuoi.length()<100) {
			System.out.println("Thoa man do dai");
		} else if(chuoi.length()==5) {
			System.out.println("Do dai bang 5");
		}  else{
		
			System.out.println("Else");
		}
		
		int length = chuoi.length();
		
		//cu phap switch case. Viết theo 1 lệnh theo logic
		switch (length) {
		case 1:
			System.out.println("Do dai bang 1");
			break;
		case 5:
			System.out.println("Do dai bang 5");
			break;
		default:
			System.out.println("Do dai bang 10");
			break;
		}
		
		}
}


