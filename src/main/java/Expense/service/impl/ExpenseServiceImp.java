package Expense.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Expense.dto.Expense;
import Expense.mapper.ExpenseMapper;
import Expense.service.ExpenseService;

@Service
public class ExpenseServiceImp implements ExpenseService {
	protected static final Log log = LogFactory.getLog(ExpenseServiceImp.class);
	
	@Autowired
	private ExpenseMapper mapper;
	
	@Override
	public List<Expense> getList() {
		List<Expense> list = mapper.SelectExpenseByAll();
		log.debug("service - getList() > " + list.size());
		return list;
	}

	@Override
	public int countList() {
		int countList = mapper.countTotal();
		log.debug("service - countList() > " + countList);
		return countList;
	}

	@Override
	public List<Expense> getProcessList(HashMap<String, Object> paramMap) {
		List<Expense> processList = mapper.selectExpenseByProcess(paramMap);
		return processList;
	}

}