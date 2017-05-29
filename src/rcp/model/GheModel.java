package rcp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import rcp.util.Database;

public class GheModel {
	/**
	 * Lấy danh sách ghế đã đặt của một suất chiếu
	 * 
	 * @param maSuatChieu
	 * 			mã suất chiếu
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<String> layDanhSach(String maSuatChieu) throws SQLException {
		ResultSet rs = Database.callStored("sp_LayDanhSachGhe_SuatChieu", maSuatChieu);

		ArrayList<String> arr = new ArrayList<>();
		while (rs.next()) {
			arr.add(rs.getString(1));
		}
		return arr;
	}
}
