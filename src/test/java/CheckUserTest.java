package test.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import bookmall.beans.user;

public class CheckUserTest {

	@Test
	public void credencialesValidas() {
		user us = new user();
		us.setId("ddliu");
		us.setPwd("ddliu");
		try {
			assertEquals(true, us.check());
		} catch (Exception e) {
			fail("Error en la conexión a BD");
			e.printStackTrace();
		}
	}
	@Test
	public void credencialesNoValidas() {
		user us = new user();
		us.setId("ddliu");
		us.setPwd("errorclave");
		try {
			assertEquals(false, us.check());
		} catch (Exception e) {
			fail("Error en la conexión a BD");
			e.printStackTrace();
		}
	}
}
