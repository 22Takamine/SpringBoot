<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
  <form:form action="menu" modelAttribute="test">
    <div>
      <label>ログインID:</label>
      <form:input path="id"/>
    </div>
    <div>
      <label>パスワード:</label>
      <form:password path="pass"/>
    </div>
    <form:button name="menu">送信</form:button>
    <div><a href="index">戻る</a></div>
  </form:form>
</body>
</html>