package rcp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rcp.entity.PhongChieu;
import rcp.model.*;

public class PhongChieuController {
	public static ArrayList<PhongChieu> taiTatCa() throws SQLException {
		return PhongChieuModel.taiTatCa();	
	}
}
