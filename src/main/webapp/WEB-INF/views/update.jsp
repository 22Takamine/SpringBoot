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
<title>更新画面</title>
</head>
<body>
  <h1>更新する情報を入力してください</h1>
  
  <c:if test="${not empty msg}">
  	<p>${fn:escapeXml(msg)}</p>
  </c:if>
  <form:form action="update" modelAttribute="index" method="post">
  <div>
      <label><fmt:message key="form.lbl.id"/></label><form:input path="id"/>
      <form:errors path="id" cssStyle="color: red"/>
    </div>
    <div>
      <label><fmt:message key="form.lbl.name"/></label><form:input path="name"/>
      <form:errors path="name" cssStyle="color: red"/>
    </div>
    <div>
      <label><fmt:message key="form.lbl.price"/></label><form:input path="price"/>
      <form:errors path="price" cssStyle="color: red"/>
    </div>
    <form:button><fmt:message key="form.lbl.update"/></form:button>
  </form:form>
</body>
</html>
