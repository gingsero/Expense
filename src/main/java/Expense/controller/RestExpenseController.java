package Expense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Expense.dto.Expense;
import Expense.service.ExpenseService;

@RestController					//Spring MVC Controller에 @ResponseBody가 추가된것, 주용도로 JSON형태로 객체 데이터를 반환
@RequestMapping("/api")			//api만들기
public class RestExpenseController {
	
	@Autowired
	private ExpenseService service;
	
	@GetMapping("/list")
	public ResponseEntity<Object> Expense(){
		System.out.println("Expense()");
		return ResponseEntity.ok(service.getList());
	}

	@GetMapping("/getList/{process_status}")
	public ResponseEntity<Object> getExpense(@PathVariable String process_status){
		System.out.println("getExpense()");
		List<Expense> expense = service.getProcessList(process_status);
		if(expense == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(expense);
	}
}
