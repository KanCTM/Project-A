package HW2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baiTap3 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
          List<String> lists = new ArrayList<>();
          
          System.out.print("Nhap so luong phan tu: ");
          int numberOfItem = scanner.nextInt();
          scanner.nextLine();
          System.out.println();
          
          for (int i = 0; i < numberOfItem; i++) {
                  System.out.println("Nhap phan tu thu " + i + " : ");
                  String item = scanner.nextLine();
                  lists.add(item);
          }
          
          String Chuoi = "";
          for (int i = 0; i < lists.size(); i++) {
                  Chuoi = Chuoi + lists.get(i);
          }
          System.out.println("in ra chuoi: " + Chuoi);

	}

}
