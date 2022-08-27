package model;

public class Department {
	private String maphong;
	private String tenphong;
	private String truongphong;
	
	
	public Department() {
		
	}

	
	public String getMaphong() {
		return maphong;
	}

	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}

	public String getTenphong() {
		return tenphong;
	}

	public void setTenphong(String tenphong) {
		this.tenphong = tenphong;
	}

	public String getTruongphong() {
		return truongphong;
	}

	public void setTruongphong(String truongphong) {
		this.truongphong = truongphong;
	}


	public Department(String maphong, String tenphong, String truongphong) {
		this.maphong = maphong;
		this.tenphong = tenphong;
		this.truongphong = truongphong;
	}
	
	
}
