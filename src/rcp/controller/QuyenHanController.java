package rcp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rcp.entity.QuyenHan;
import rcp.model.QuyenHanModel;

public class QuyenHanController {
	
	/**
	 * Lấy danh sách quyền hạn
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<QuyenHan> taiTatCa() throws SQLException {
		return QuyenHanModel.taiTatCa();		
	}
	
	/**
	 * Lấy thông tin một quyền hạn
	 * 
	 * @param maQuyen
	 * @return
	 * @throws SQLException
	 */
	public static QuyenHan layThongTin(String maQuyen) throws SQLException {
		return QuyenHanModel.layThongTin(maQuyen);
	}
}