package com.sriram.persistent;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sriram.bean.Book;
import com.sriram.bean.Employee;

public interface TransactionDao {
		
	boolean updateTransaction(int empId,int bookId) throws SQLException,ClassNotFoundException;
	boolean authenticate(String username, String password) throws ClassNotFoundException, SQLException;
	boolean removeTransaction(int empId, int bookId) throws ClassNotFoundException, SQLException;
	
	
	
	
	
	
	
	
	
	
	
	



}