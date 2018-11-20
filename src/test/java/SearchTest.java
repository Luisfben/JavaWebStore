package test.java;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

import bookmall.tool.ConnDB;

public class SearchTest {

	@Test
	public void searchNombreLibro() {
		ConnDB db = new ConnDB();
		String name = "Extreme";
		String sql = "select * from book where name like '%" + name + "%'";
		ResultSet rs = db.executeQuery(sql);
		try {
			rs.next();
			assertEquals(rs.getString(1), "Extreme Earth");
		} catch (Exception e) {
			fail("Error en la conexión a BD");
			e.printStackTrace();
		}
	}
}
