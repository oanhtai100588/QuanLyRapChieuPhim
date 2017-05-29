package rcp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rcp.entity.ChucVu;
import rcp.model.*;

public class ChucVuController {
	public static ArrayList<ChucVu> taiTatCa() throws SQLException {
		return ChucVuModel.taiTatCa();
		
	}

}
