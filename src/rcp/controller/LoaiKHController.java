package rcp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rcp.entity.LoaiKhachHang;
import rcp.model.LoaiKhachHangModel;

public class LoaiKHController {

	/**
	 * Lấy danh sách loại khách hàng
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<LoaiKhachHang> taiTatCa() throws SQLException {
		return LoaiKhachHangModel.taiTatCa();
	}

}
