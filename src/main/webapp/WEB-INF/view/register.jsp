<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action='../expense/add.do' method='post' enctype='multipart/form-data' target="list.do">

<h2 class='add'>경비 등록  / 수정</h2>
<table class="add">
    <tr>
       <th>사용내역*</th>
       <td><select>
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
       <th>사용일*</th>
       <td><input name="useDate" type="date"></td>
   </tr>
    <tr>
       <th>금액*</th>
       <td><input name="usePrice" type="text"></td>
   </tr>
    <tr>
       	<th>영수증*</th>
    	<td><input name="imageFile" type="file"></td>
  </tr>

</table>
  <input name="registrationDate" type="date" style="display: none" id="currentDate">
    <script>
</script> 
<div class='button'>
<input type="button" onclick="window.close()" value="닫기"/>
<input type="submit" value="저장" onclick="window.close()"/>
</div>
</form>
</body>
</html>