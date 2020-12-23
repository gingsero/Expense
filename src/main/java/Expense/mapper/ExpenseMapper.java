package Expense.mapper;

import java.sql.Timestamp;
import java.util.List;

import Expense.dto.Expense;


public interface ExpenseMapper {
	 List<Expense> SelectExpenseByAll();
	 
	 List<Expense> selectExpenseByProcess(Timestamp use_date, String name, String process_status);
	
	 
	 int countTotal(); 
}
