<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="view/color.jspf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 삭제</title>
<link rel="stylesheet" href="./style.css" type="text/css"/>
<script type="text/javascript" src="./js/script.js"></script>
<scirpt type="text/javascript">
	function passCheck(value){
		if(value == "successDelete")){
			alert("글이 삭제되었습니다.");
			window.location = "list.do";
		}
		if(value == "passerror")){
			alert("비밀번호가 틀렸습니다.");
		}
	}
	window.onload = passCheck("${value }");
</scirpt>
</head>
<body>
<form action="deleteForm.do?num=${num}">
<table>
	<tr>
		<td>글을 삭제하시려면 비밀번호를 입력해주세요.</td>
	</tr>
	<tr>
		<td><input type="password" name="pass" value="${pass}"/></td>
		<td><input type="submit" value="확인"/></td>
	</tr>
</table>
</form>
</body>
</html>