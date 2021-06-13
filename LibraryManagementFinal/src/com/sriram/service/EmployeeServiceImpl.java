package com.sriram.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sriram.bean.Book;
import com.sriram.bean.Employee;
import com.sriram.persistent.BookDao;
import com.sriram.persistent.BookDaoImpl;
import com.sriram.persistent.EmployeeDao;
import com.sriram.persistent.EmployeeDaoImpl;
import com.sriram.persistent.TransactionDao;
import com.sriram.persistent.TransactionDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	private BookDao bookDao=new BookDaoImpl();
	private TransactionDao transactionDao=new TransactionDaoImpl();

	@Override
	public ArrayList<Book> showDataAnalytics() throws SQLException, ClassNotFoundException {
		
		return bookDao.showAvailableDataAnalytics();
		
	}

	@Override
	public ArrayList<Book> showTechnology() throws SQLException, ClassNotFoundException{
		
		 return bookDao.showAvailableTechnology();
	}
	
	@Override
	public ArrayList<Book> showManagement() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return bookDao.showAvailableManagement();
	}
	@Override
	public boolean selectDataAnalytics(int id) throws ClassNotFoundException, SQLException {
	
		return bookDao.selectDataAnalytics(id);
	}

	@Override
	public boolean selectTechnology(int id) throws ClassNotFoundException, SQLException {
		return bookDao.selectTechnology(id);
	}

	@Override
	public boolean selectManagement(int id) throws ClassNotFoundException, SQLException {
		return bookDao.selectDataAnalytics(id);
	}

	@Override
	public boolean updateTransaction(int empId,int bookId) throws ClassNotFoundException, SQLException{
		return transactionDao.updateTransaction(empId,bookId);
		
	}

	@Override
	public boolean authenticate(String username, String password) throws ClassNotFoundException, SQLException {
		
		return transactionDao.authenticate(username,password);
	}

	@Override
	public boolean isValidEmployee(int empId) throws ClassNotFoundException, SQLException {
		
		return employeeDao.isValidEmployee(empId);
	}

	@Override
	public ArrayList<Book> viewAllBooks() throws ClassNotFoundException, SQLException {
		
		 return bookDao.viewAllBooks();
		
	}

	@Override
	public int returnBook(int empId, int bookId) throws ClassNotFoundException, SQLException {
		
		return bookDao.returnBook(empId,bookId);
		
	}

	@Override
	public String getBookType(int bookId) throws ClassNotFoundException, SQLException {
		
		return bookDao.getBookType(bookId);
	}

	@Override
	public boolean removeTransaction(int empId, int bookId) throws ClassNotFoundException, SQLException {
		
		return transactionDao.removeTransaction(empId,bookId);
		
	}

	@Override
	public boolean increaseQuantity(int bookId) throws ClassNotFoundException, SQLException {
		
		return bookDao.increaseQuantity(bookId);
	}

	@Override
	public Employee printDetails(int empId, int bookId) throws ClassNotFoundException, SQLException {
		
		return employeeDao.printDetails(empId,bookId);
	}

	@Override
	public Book printBookDetails(int bookId) throws ClassNotFoundException, SQLException {
		
		return bookDao.printBookDetails(bookId);
	}

	

	

	


	
}