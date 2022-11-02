package ObjectDemo;

public class PhuongTienGiaoThong {

	// Tính kế thừa
	private String mauSac;
	private String loaiPhuongTien;

	public PhuongTienGiaoThong() {
		super();
	}

	public PhuongTienGiaoThong(String mauSac, String loaiPhuongTien) {
		super();
		this.mauSac = mauSac;
		this.loaiPhuongTien = loaiPhuongTien;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}

	public String getLoaiPhuongTien() {
		return loaiPhuongTien;
	}

	public void setLoaiPhuongTien(String loaiPhuongTien) {
		this.loaiPhuongTien = loaiPhuongTien;
	}

	// Kế thừa
	public String diChuyen(String type) {

		String result = "";

		if (type.equals("Oto")) {
			result = "Chạy bằng 4 bánh";
		}
		if (type.equals("xe may")) {
			result = "Chạy bằng 2 bánh";

		}
		return result;
	}
}
