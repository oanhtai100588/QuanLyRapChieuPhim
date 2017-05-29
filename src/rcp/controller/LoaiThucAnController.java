package rcp.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import rcp.entity.LoaiThucAn;
import rcp.model.*;

public class LoaiThucAnController {
	public static ArrayList<LoaiThucAn> taiTatCa() throws SQLException {
		return LoaiThucAnModel.taiTatCa();
	}
}
