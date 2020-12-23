package Expense.service;

import java.util.HashMap;
import java.util.List;

import Expense.dto.Expense;

public interface ExpenseService {
	List<Expense> getList();
	
	List<Expense> getProcessList(HashMap<String, Object> paramMap);
	
	int countList();

}
