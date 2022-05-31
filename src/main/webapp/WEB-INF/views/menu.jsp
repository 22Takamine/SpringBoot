<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー画面</title>
</head>
<body>
  <form:form action="login" modelAttribute="test">
    <div>メニュー画面</div>
    <div>メニューはまだありません</div>
    <div>ID:${fn:escapeXml(id)} PASS:${fn:escapeXml(pass)}</div>
    <div><a href="login">戻る</a></div>
  </form:form>
</body>
</html>