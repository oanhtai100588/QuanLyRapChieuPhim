package rcp.controller;

import java.sql.*;
import java.util.*;
import rcp.entity.*;
import rcp.model.*;

public class KhuyenMaiController {
	
	/**
	 * Lấy danh sách khuyến mãi
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<KhuyenMai> taiTatCa() throws SQLException {
		return KhuyenMaiModel.taiTatCa();
	}
}
