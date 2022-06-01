<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Web MVC Test</title>
</head>
<body>
  <form:form action="result" modelAttribute="index">
    <div>
      <label>名前:</label>
      <form:input path="name"/>
    </div>
    <div>
      <label>商品:</label>
      <form:select path="productId">
        <form:options items="${productList}" itemLabel="productName" itemValue="productId" />
      </form:select>
    </div>
    <form:button>送信</form:button>
  </form:form>
</body>
</html>