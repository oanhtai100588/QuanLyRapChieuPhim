package rcp.entity;

public class LoaiGhe {
	private String maLoaiGhe;
	private String tenLoaiGhe;
	private double phuThuGhe;
	
	public LoaiGhe(){
		//nothing
	}
	
	public LoaiGhe(String maLoaiGhe, String tenLoaiGhe, double phuThuGhe){
		setMaLoaiGhe(maLoaiGhe);
		setTenLoaiGhe(tenLoaiGhe);
		setPhuThuGhe(phuThuGhe);
	}
	
	public String getMaLoaiGhe() {
		return maLoaiGhe;
	}
	public void setMaLoaiGhe(String maLoaiGhe) {
		this.maLoaiGhe = maLoaiGhe;
	}
	public String getTenLoaiGhe() {
		return tenLoaiGhe;
	}
	public void setTenLoaiGhe(String tenLoaiGhe) {
		this.tenLoaiGhe = tenLoaiGhe;
	}
	public double getPhuThuGhe() {
		return phuThuGhe;
	}
	public void setPhuThuGhe(double phuThuGhe) {
		this.phuThuGhe = phuThuGhe;
	}	
}
