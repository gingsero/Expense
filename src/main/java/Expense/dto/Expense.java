package Expense.dto;

import java.sql.Timestamp;

public class Expense {
	private int expense_no;					//순번
	private Timestamp use_date;				//사용일
	private String name;					//사용내역
	private String use_price;				//사용금액
	private String approve_price;			//승인금액		
	private String process_status;			//처리상태			
	private Timestamp registration_date;	//등록일
	private String receipt;					//영수증			
	private Timestamp process_date; 		//처리일시				
	private String remark;					//비고
	
	public Expense() {}


	public Expense(int expense_no, Timestamp use_date, String name, String use_price, String approve_price,
			String process_status, Timestamp registration_date, String receipt, Timestamp process_date, String remark) {
		super();
		this.expense_no = expense_no;
		this.use_date = use_date;
		this.name = name;
		this.use_price = use_price;
		this.approve_price = approve_price;
		this.process_status = process_status;
		this.registration_date = registration_date;
		this.receipt = receipt;
		this.process_date = process_date;
		this.remark = remark;
	}


	public int getExpense_no() {
		return expense_no;
	}

	public void setExpense_no(int expense_no) {
		this.expense_no = expense_no;
	}

	public Timestamp getUse_date() {
		return use_date;
	}

	public void setUse_date(Timestamp use_date) {
		this.use_date = use_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUse_price() {
		return use_price;
	}

	public void setUse_price(String use_price) {
		this.use_price = use_price;
	}

	public String getApprove_price() {
		return approve_price;
	}

	public void setApprove_price(String approve_price) {
		this.approve_price = approve_price;
	}

	public String getProcess_status() {
		return process_status;
	}

	public void setProcess_status(String process_status) {
		this.process_status = process_status;
	}

	public Timestamp getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(Timestamp registration_date) {
		this.registration_date = registration_date;
	}

	public String getReceipt() {
		return receipt;
	}

	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}

	public Timestamp getProcess_date() {
		return process_date;
	}

	public void setProcess_date(Timestamp process_date) {
		this.process_date = process_date;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return String.format(
				"Expense [expense_no=%s, use_date=%s, name=%s, use_price=%s, approve_price=%s, process_status=%s, registration_date=%s, receipt=%s, process_date=%s, remark=%s]",
				expense_no, use_date, name, use_price, approve_price, process_status, registration_date, receipt,
				process_date, remark);
	}


	

	
	
}
