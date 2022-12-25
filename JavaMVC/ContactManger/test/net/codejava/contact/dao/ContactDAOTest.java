package net.codejava.contact.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import net.codejava.contact.model.Contact;

class ContactDAOTest {
	private DriverManagerDataSource dataSource;
	private ContactDAO dao;
	
	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactdb");
		dataSource.setUsername("root");
		dataSource.setPassword("Decathl0n");
		
		dao = new ContactDAOImpl(dataSource);
	}
	

	@Test
	void testSave() {
		Contact contact = new Contact("Steve Jobs", "steve@apple.com", "Cuperticno, CA", "1234567890");
		assertTrue(dao.save(contact) > 0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(2, "Bill Gates", "bill@microsoft.com", "Redmond, WA", "0987654321");
		assertTrue(dao.update(contact) > 0);
	}

	@Test
	void testGet() {
		Integer id = 1;
		Contact contact = dao.get(id);
		
		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		Integer id = 3;
		int result = dao.delete(id);
		
		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Contact> listContacts = dao.list();
		
		assertTrue(!listContacts.isEmpty());
	}

}
