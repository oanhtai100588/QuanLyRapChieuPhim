package rcp.controller;

import java.sql.*;
import java.util.*;
import rcp.entity.*;
import rcp.model.*;

public class QuyDinhController {
	
	/**
	 * Lấy danh sách quy định
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<QuyDinh> taiTatCa() throws SQLException {
		return QuyDinhModel.taiTatCa();
	}
	
	/**
	 * Thay đổi quy định
	 * 
	 * @param qd
	 * @return
	 * @throws SQLException
	 */
	public static boolean sua(QuyDinh qd) throws SQLException {
		return QuyDinhModel.sua(qd);
	}
}