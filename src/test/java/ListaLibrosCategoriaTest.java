package test.java;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

import bookmall.tool.ConnDB;

public class ListaLibrosCategoriaTest {

	@Test
	public void listaLibrosCategoria() {
		ConnDB db = new ConnDB();
		String category = "Arts";
		String sql="select * from book where category='"+category+"'";
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
