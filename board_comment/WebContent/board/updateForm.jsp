<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="view/color.jspf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 수정</title>
<link rel="stylesheet" href="./style.css" type="text/css"/>
<script type="text/javascript" src="./js/script.js"></script>
<scirpt type="text/javascript">
	function passCheck(value){
		if(value == "pass" || vaue.equals("pass")){
			alert("비밀번호가 틀렸습니다.");
	}
window.onload = passCheck("${value }");
</scirpt>
</head>
<body bgcolor="${bodyback_c}">
<div align="center" class="body">
<form action="updateForm.do?num=${vo.num}" method="post" name="writeForm" enctype="multipart.form-data">
<center>
	<h3>글수정</h3>
	<table width="450" border="1">
		<tr>
			<td align="center" width="80" bgcolor="${value_c}">작성자</td>
			<td align="left"><input type="text" size="22" name="writer" value="${vo.writer }"/></td>
		</tr>
		<tr>
			<td width="70" align="center" bgcolor="${value_c}">비밀번호</td>
			<td align="left" ><input type="password" name="pass" value="${pass }"/></td>
		</tr>
		<tr>
			<td align="center" bgcolor="${value_c}">이메일</td>
			<td align="left"><input type="text" size="61" name="email" value="${vo.email }"/></td>
		</tr>
		<tr>
			<td align="center" bgcolor="${value_c}">제목</td>
			<td align="left"><input type="text" size="61" name="subject" value="${vo.subject }"/></td>
		</tr>
		<tr>
			<td align="center" bgcolor="${value_c}">내용</td>
			<td><textarea name="content" cols="60" rows="13">{vo.content}</textarea></td>
		</tr>
	</table>
	<br />
		<input type="button" value="글쓰기" onclick="writeCheck()"/>
		<input type="button" value="목록보기" onclick="window.location='list.do'"/>
</center>
</form>
</div>
</body>
</html>