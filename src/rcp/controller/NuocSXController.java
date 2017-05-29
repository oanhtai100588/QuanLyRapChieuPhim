package rcp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rcp.entity.NuocSX;
import rcp.model.NuocSanXuatModel;

public class NuocSXController {
	/**
	 * Tải tất cả nước sản xuất
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<NuocSX> taiTatCa() throws SQLException
	{
		return NuocSanXuatModel.taiTatCa();
	}


}
