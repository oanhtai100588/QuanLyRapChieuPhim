package rcp.entity;

public class PhongChieu {
	private String maPhong;
	private String tenPhong;
	
	public PhongChieu(){
		//nothing
	}
	
	public PhongChieu(String maPhong, String tenPhong){
		setMaPhong(maPhong);
		setTenPhong(tenPhong);
	}
	
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
}
