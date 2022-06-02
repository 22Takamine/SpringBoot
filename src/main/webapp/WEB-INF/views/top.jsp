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
<title>トップ画面</title>
</head>
<body>
  <h1>検索条件または登録情報を入力してください</h1>
  
  <c:if test="${not empty msg}">
  	<p>${fn:escapeXml(msg)}</p>
  </c:if>
  <form:form action="result" modelAttribute="index" method="post">
    <div>
      <label><fmt:message key="form.lbl.name"/></label><form:input path="name"/>
      <form:errors path="name" cssStyle="color: red"/>
    </div>
    <div>
      <label><fmt:message key="form.lbl.price"/></label><form:input path="price"/>
      <form:errors path="price" cssStyle="color: red"/>
    </div>
    <form:button name="seach"><fmt:message key="form.lbl.seach"/></form:button>
    <form:button name="register"><fmt:message key="form.lbl.register"/></form:button>
  </form:form>
</body>
</html>
