package ObjectDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Car> listOfCar = new ArrayList<>(); 
		
		// Khai báo khởi tạo Object không tham số và set giá trị
		Car car1 = new Car();
		car1.setLoaiPhuongTien("Oto");
		car1.setMauSac("Màu Đen");
		car1.setHang("Toyota");
//		car1.setMauSac("Màu Đen");
		car1.setTrongLuong(100);
		car1.setKichThuocRong(20);
		car1.setKichThuocCao(15);
		
		System.out.println(car1.diChuyen(car1.getLoaiPhuongTien()));

		// Khai báo khởi tạo Object có tham số và set giá trị
		Car car2 = new Car("Nissan", 200, 30, 50);
		
		listOfCar.add(car1);
		listOfCar.add(car2);
		
		for (int i = 0; i <listOfCar.size(); i++) {
			Car item = listOfCar.get(i);
			System.out.println(item.toString());
			System.out.println("Hãng xe là: "+ item.getHang());
			
		}
		
	}

}
