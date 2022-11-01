package HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baiTap1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean menu = true;

		do {

			System.out.print("Nhap option la ");
			int option = scanner.nextInt();

			// Kiểm tra giá trị
			switch (option) {
			// Check hw1
			case 1: {
				boolean menu1 = true;
				while (menu1) {
					System.out.println();
					System.out.println("Bài tập java core");
					
					
					// Check bài tập
					int baiTap = scanner.nextInt();
					switch (baiTap) {
					case 1:
						System.out.println("Bài 1");
						System.out.println();
						System.out.println("Nhập vào số thứ nhất: ");
						int firstNumber = scanner.nextInt();
						System.out.println("Nhập vào số thứ hai: ");
						int secondNumber = scanner.nextInt();

						// Tính tổng
						int tong = firstNumber + secondNumber;
						System.out.println(firstNumber + " + " + secondNumber + " = " + tong);

						// Check tổng
						if (tong % 2 == 0) {
							System.out.println(tong + " " + "là số chẵn");
						} else {
							System.out.println(tong + " " + "là số lẻ");
						}
						break;
						
						
						
					case 2:
						System.out.println();
						System.out.println("Bài 2");
						
						
						 System.out.println("Nhập vào số thứ nhất: ");
					        int a  = scanner.nextInt();
					        System.out.println("Nhập vào số thứ hai: ");
					        int b = scanner.nextInt();
					        System.out.println("Nhập vào số thứ ba: ");
					        int c = scanner.nextInt();
					       
					     
					     // Check độ dài tam giác để xem tam giác đó là gì (tam giác vuông)
					        if ((a>b+c) || (b>a+c) || (c>a+b) || a<0 || b <0 || c<0)  {
								System.out.println("Đây không phải là tam giác");
								
					        } else if (a==b && b==c) {
								System.out.println("Đây là tam giác đều");
								
							} else if  (a==b || b==c || c==a ) {
								System.out.println("Đây là tam giác cân");
								
							} else if  ((a*a==b*b+c*c) || (b*b==a*a+c*c) || (c*c==a*a+b*b)  ) {	
								System.out.println("Đây là tam giác vuông");
								
							}else if  ((a*a==b*b+c*c)&& (c== b) || (b*b==a*a+c*c)&& (c==a) || (c*c==a*a+b*b)&& (a==b)  ) {	
								System.out.println("Đây là tam giác vuông cân");
								
							} else {
								System.out.println("Đây là tam giác thường");
							}
						break;
						

					case 3:
						System.out.println("Bài 3");
						System.out.println();
						
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
						break;
						
					// check out khỏi HW1	
					case 4:
						menu1 = false;
						System.out.println("Exit Java Core");
					default:
						continue;
					}
				}
			}
			
			//Check HW2
			case 2: {
				boolean menu2 = true;
				while (menu2) {
					System.out.println();
					System.out.println("Bai tap Array List");
					
					int baiTap = scanner.nextInt();
					
					
					switch (baiTap) {
					case 1:
						System.out.println("Bai 1");
						System.out.println();
						
						List<Integer> lists = new ArrayList<>();
						System.out.println("Nhap so luong phan tu: ");
						
						int numberOfItem = scanner.nextInt();
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
						
						break;
						
					case 2:
						System.out.println("Bai 2");
						System.out.println();
						
						List<Integer> lists2 = new ArrayList<>();
						System.out.println("Nhap so luong phan tu: ");
						
						int numberOfItem2 = scanner.nextInt();
						for (int i = 0; i < numberOfItem2; i++) {
							System.out.println("Nhap phan tu thu " + i + " : ");
							int number = scanner.nextInt();
							lists2.add(number);
						}
						System.out.println("cac phan tu trong list");
						int sum = 0;
						for (int i = 0; i < lists2.size(); i++) {
							System.out.println(lists2.get(i));
							sum = sum + lists2.get(i);
						}
						System.out.println("Tong cac phan tu trong list: " + sum);
						break;
						
					case 3:
						System.out.println("Bai 3");
						List<String> lists3 = new ArrayList<>();
						System.out.print("Nhap so luong phan tu: ");
						
						int numberOfItem3 = scanner.nextInt();
						scanner.nextLine();
						System.out.println();
						for (int i = 0; i < numberOfItem3; i++) {
							System.out.println("Nhap phan tu thu " + i + " : ");
							String item = scanner.nextLine();
							lists3.add(item);
						}
						String Chuoi = "";
						for (int i = 0; i < lists3.size(); i++) {
							Chuoi = Chuoi + lists3.get(i);
						}
						System.out.println("in ra chuoi: " + Chuoi);
						break;
						
					case 4:
						menu2 = false;
						System.out.println("Exit Array List");
					default:
						continue;

					}
				}
			}
			//Check exit
			case 3:
				menu = false;
				System.out.print("Exit chuong trinh");
			}
		} while (menu);
	}
}
