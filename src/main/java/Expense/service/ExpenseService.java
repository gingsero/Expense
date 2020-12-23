package Expense.service;

import java.sql.Timestamp;
import java.util.List;

import Expense.dto.Expense;

public interface ExpenseService {
	List<Expense> getList();
	
	List<Expense> getProcessList(Timestamp use_date, String name, String process_status);
	
	int countList();

}
