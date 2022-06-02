<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一覧画面</title>
<style>
body {
    border: solid 2px #000080;
    display: inline-block;
    padding: 5px;
    
}
</style>
</head>
<body>
  <h1>検索結果</h1>
  <table border="1">
    <tr>
      <th><fmt:message key="form.lbl.productId"/></th>
      <th><fmt:message key="form.lbl.productName"/></th>
      <th><fmt:message key="form.lbl.productPrice"/></th>
    </tr>
    <c:forEach var="product" items="${productList}">
      <tr>
        <td>${fn:escapeXml(product.productId)}</td>
        <td>${fn:escapeXml(product.productName)}</td>
        <td>${fn:escapeXml(product.price)}</td>
      </tr>
    </c:forEach>
  </table>
  
  <form:form action="index" modelAttribute="index" method="post">
    <form:button><fmt:message key="form.lbl.back"/></form:button>
  </form:form>
 
</body>
</html>