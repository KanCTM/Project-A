package ObjectDemo;
// Kết thừa class sẽ thêm extends, interface thì sẽ là implements 
public class Car extends PhuongTienGiaoThong implements TestInterface, TestInterface2{

	private String hang;
//	private String mauSac;
	private int trongLuong;
	private int kichThuocRong;
	private int kichThuocCao;

	public Car() {
		super();
	}

	public Car(String hang, int trongLuong, int kichThuocRong, int kichThuocCao) {
		super();
		this.hang = hang;
		this.trongLuong = trongLuong;
		this.kichThuocRong = kichThuocRong;
		this.kichThuocCao = kichThuocCao;
	}

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public int getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(int trongLuong) {
		this.trongLuong = trongLuong;
	}

	public int getKichThuocRong() {
		return kichThuocRong;
	}

	public void setKichThuocRong(int kichThuocRong) {
		this.kichThuocRong = kichThuocRong;
	}

	public int getKichThuocCao() {
		return kichThuocCao;
	}

	public void setKichThuocCao(int kichThuocCao) {
		this.kichThuocCao = kichThuocCao;
	}

	@Override
	public String toString() {
		return "Car [hang=" + hang  + ", trongLuong=" + trongLuong + ", kichThuocRong="
				+ kichThuocRong + ", kichThuocCao=" + kichThuocCao + "]";
	}
	
	// ghi đè lại bằng phương thúc khác với PTGT - Tính đa hình
	@Override
	public String diChuyen(String type) {
		return type;
	}

	@Override
	public int test3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String test2(int demSo) {
		// TODO Auto-generated method stub
		return null;
	}

}
