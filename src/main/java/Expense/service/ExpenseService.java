package Expense.service;

import java.util.List;

import Expense.dto.Expense;

public interface ExpenseService {
	List<Expense> getList();
	
	List<Expense> getProcessList(String process_status);
	
	int countList();

}
