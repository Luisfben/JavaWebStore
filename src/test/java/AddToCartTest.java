package test.java;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.Test;

import bookmall.Dao.BookDao;
import bookmall.Dao.CartManager;
import bookmall.beans.Book;
import bookmall.beans.Item;
import bookmall.tool.ConnDB;

public class AddToCartTest {

	@Test
	public void searchNombreLibro() {
		String bookid = "1250058902";
		CartManager cartManager = new CartManager();
		Book book = new Book();
		Item item = new Item();
		BookDao bd = new BookDao();

		book = bd.findById(Integer.parseInt(bookid));
		cartManager.addToCart(book, 1);
		
		item = (Item) cartManager.getCart().get(0);
		assertEquals("Humans of New York: Storie", item.getBook().getName());
	}
}
