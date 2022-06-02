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
<title>削除画面</title>
<style>
body {
    border: solid 2px #000080;
    display: inline-block;
    padding: 5px;
    
}
</style>
</head>
<body>
  <h1>削除対象のproduct_idを入力してください</h1>
  <c:if test="${not empty msg}">
  	<p>${fn:escapeXml(msg)}</p>
  </c:if>
  <form:form action="delete" modelAttribute="index" method="post">
    <div>
      <label><fmt:message key="form.lbl.id"/></label><form:input path="id"/>
      <form:errors path="id" cssStyle="color: red"/>
    </div>
    
    <form:button><fmt:message key="form.lbl.delete"/></form:button>
  </form:form>
 
</body>
</html>