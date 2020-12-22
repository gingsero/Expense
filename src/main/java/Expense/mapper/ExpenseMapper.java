package Expense.mapper;

import java.util.List;

import Expense.dto.Expense;


public interface ExpenseMapper {
	 List<Expense> SelectExpenseByAll();
	 
	 List<Expense> selectExpenseByProcess(String process_status);
	 
	 int countTotal(); 
}
