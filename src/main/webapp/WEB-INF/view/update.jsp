<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 업데이트 -->
<form action='../expense/update.do' method='post' enctype='multipart/form-data'  target="list.do">
<input name="expenseNo" type="hidden">
<h3>사용내역</h3>
<table class="update" style="float: left;">
    <tr>
       <th>사용내역</th>
       <td><select name="name">
    <option value="" selected> 선택</option>
    <option value="식대(야근)">식대(야근)</option>
    <option value="택시비(야근)">택시비(야근)</option>
    <option value="택시비(회식)">택시비(회식)</option>
    <option value="사무용품구매">사무용품구매</option>
    <option value="교육비">교육비</option>
    <option value="접대비">접대비</option>
    </select></td> 
   </tr>
    <tr>
       <th>사용일</th>
       <td><input name="useDate" type="date"></td>
   </tr>
    <tr>
       <th>금액</th>
       <td><input name="usePrice" type="text"></td>
   </tr>
    <tr>
       	<th>영수증</th>
    	<td><input name="imageFile" type="file" id="input_img"></td>
  </tr>
</table>

<div class="update_image">
<h3>영수증</h3>
<img id="img" style="height: 150px;"/>
<br>
<input type="submit" value="저장" onclick="window.close()"/>
<input type="button" value="삭제">
<input type="button" onclick="window.close()"value="닫기">
</div>
<h3>청구내역</h3>
<table class="update">
    <tr>
       <th>처리상태</th>
       <td><select>
		  		<option value="" selected> 선택</option>
			    <option value="접수">접수</option>
			    <option value="승인">승인</option>
			    <option value="지급완료">지급완료</option>
    			<option value="반려">반려</option>
			</select> </td> 
   </tr>
    <tr>
       <th>처리일시</th>
       <td><input name="processDate" type="date"id="currentDate">
       <script>
</script> 
       </td>
   </tr>
    <tr>
       <th>금액</th>
       <td><input name="approvePrice" type="text" ></td>
   </tr>
    <tr>
       	<th>영수증</th>
    	<td><input name="remark" type="text"></td>
  </tr>
</table>

</form>


</body>
</html>