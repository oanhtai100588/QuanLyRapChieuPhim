package rcp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rcp.model.GheModel;

public class GheController {
	/**
	 * Lấy danh sách ghế đã đặt của một suất chiếu
	 * 
	 * @param maSuatChieu
	 * 			mã suất chiếu
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<String> layDanhSach(String maSuatChieu) throws SQLException
	{
		return GheModel.layDanhSach(maSuatChieu);
	}
	

}
