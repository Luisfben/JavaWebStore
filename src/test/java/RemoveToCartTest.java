package test.java;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

import bookmall.Dao.BookDao;
import bookmall.Dao.CartManager;
import bookmall.beans.Book;
import bookmall.beans.Item;
import bookmall.tool.ConnDB;

public class RemoveToCartTest {

	@Test
	public void searchNombreLibro() {
		String bookid = "1250058902";
		CartManager cartManager = new CartManager();
		Book book = new Book();
		Item item = new Item();
		BookDao bd = new BookDao();

		book = bd.findById(Integer.parseInt(bookid));
		cartManager.addToCart(book, 1);

		cartManager.delete(Integer.parseInt(bookid));
		assertEquals(0, cartManager.getCart().size());
	}
}
