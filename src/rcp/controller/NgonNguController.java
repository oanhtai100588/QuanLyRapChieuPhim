package rcp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rcp.entity.NgonNgu;
import rcp.model.NgonNguModel;

public class NgonNguController {
	/**
	 * Tải tất cả ngôn ngữ
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<NgonNgu> taiTatCa() throws SQLException
	{
		return NgonNguModel.taiTatCa();
	}
}
