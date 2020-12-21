package Expense.mapper.service.impl;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Expense.dto.Expense;
import Expense.mapper.ExpenseMapper;
import Expense.mapper.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService{
	protected static final Log log = LogFactory.getLog(ExpenseServiceImpl.class);
	
	@Autowired
	private ExpenseMapper mapper;

	@Override
	public List<Expense> getList() {
		List<Expense> list = mapper.SelectExpenseByAll();
		log.debug("service - getList() > " + list.size());
		return list;
	}
	
	
}
