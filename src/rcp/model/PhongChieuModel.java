package rcp.model;

import java.sql.*;
import java.util.ArrayList;

import rcp.entity.*;
import rcp.util.*;

public class PhongChieuModel {
	/**
	 * Tải tất cả phòng chiếu
	 * 
	 * @return
	 * @throws SQLException
	 */

	public static ArrayList<PhongChieu> taiTatCa() throws SQLException {
		ResultSet rs = Database.callStored("sp_LayDanhSach_Phong", (Object[]) null);
		
		ArrayList<PhongChieu> arr = new ArrayList<>();
		while (rs.next()) {
			arr.add(new PhongChieu(rs.getString(1),rs.getString(2)));
		}

		return arr;
	}
}
