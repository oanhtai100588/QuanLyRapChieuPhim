package rcp.entity;

public class NuocSX {
	private String	 maNuocSX;
	private String	 tenNuocSX;


	public NuocSX() {
		// do nothing
	}

	public NuocSX(String maNuocSX,String tenNuocSX){
		setMaNuocSX(maNuocSX);
		setTenNuocSX(tenNuocSX);

	}

	public String getMaNuocSX() {
		return maNuocSX;
	}

	public void setMaNuocSX(String maNuocSX) {
		this.maNuocSX = maNuocSX;
	}

	public String getTenNuocSX() {
		return tenNuocSX;
	}

	public void setTenNuocSX(String tenNuocSX) {
		this.tenNuocSX = tenNuocSX;
	}
}
