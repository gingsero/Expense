<%@page import="Expense.service.ExpenseService"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resources/css/css.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(function(){
	<%-- <%SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");%> --%>
	document.getElementById("registrationDate").value = new Date().toISOString().substring(0,10);	//현재 날짜를 기본값으로
	
	var contextPath = "<%=request.getContextPath()%>";
	var params = {
			date : ${param.date}
			name : ${param.name}
			process_status : ${param.process_status}
	}
	alert("data > " + data.date + ", " + data.name + ", " + data.process_status)
	
	$.get(contextPath+"/api/getList"+params, function(json){
		var dataLength = json.length;
		//alert("list >> " + json);
		if(dataLength >= 1){
			var sCont = "";
			for(i=0; i<dataLength; i++){
				sCont += "<tr>";
				sCont += "<td>" + json[i].expense_no + "</td>";
				sCont += "<td>" + json[i].use_date + "</td>";
				sCont += "<td><a href='read?id" + json[i].expense_no + "'>" + json[i].name + "</a></td>";
				sCont += "<td>" + json[i].use_price + "</td>";
				sCont += "<td>" + json[i].approve_price + "</td>";
				sCont += "<td>" + json[i].process_status + "</td>";
				sCont += "<td>" + json[i].registration_date + "</td>";
				/* sCont += "<td>" + json[i].receipt + "</td>";
				sCont += "<td>" + json[i].process_date + "</td>";
				sCont += "<td>" + json[i].remark + "</td>"; */
				sCont += "</tr>"; 
			}
			/* sCont += "<tr>";
			sCont += "<td></td>";
			sCont += "<td></td>";
			sCont += "<td></td>"; */
			$("#load:last-child").append(sCont);
		}
	});
 
});
</script>
</head>
<body>


<br>

<div class="add_button">
			<button type="button" >엑셀다운로드</button>
			<input type="button" value="등록" onclick="open()">
</div>

<br>

<table border="1"> 
	<thead>
		<tr>
			<th>순번</th>
			<th>사용일</th>
			<th>사용내역</th>
			<th>사용금액</th>
			<th>승인금액</th>
			<th>처리상태</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody id="load">
	</tbody>
</table>
</body>
</html>