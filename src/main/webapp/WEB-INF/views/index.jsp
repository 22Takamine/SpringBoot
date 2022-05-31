<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索</title>
</head>
<body>
  <p>検索</p>
  <form:form action="result" modelAttribute="index" method="post">
    <div>
      <label>ユーザーID</label> <form:input path="id" />
    </div>
    <form:button>実行</form:button>
  </form:form>
</body>
</html>
