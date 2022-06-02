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
<style>
body {
    border: solid 2px #000080;
    display: inline-block;
    padding: 5px;
    
}
</style>
</head>
<body>
  <h1>更新完了</h1>
  
  <div>更新前</div>
  <div><fmt:message key="form.lbl.id"/>${fn:escapeXml(productOld.productId)}</div>
  <div><fmt:message key="form.lbl.name"/>${fn:escapeXml(productOld.productName)}</div>
  <div><fmt:message key="form.lbl.price"/>${fn:escapeXml(productOld.price)}</div>
   
  <div>更新後</div>
  <div><fmt:message key="form.lbl.id"/>${fn:escapeXml(productNew.productId)}</div>
  <div><fmt:message key="form.lbl.name"/>${fn:escapeXml(productNew.productName)}</div>
  <div><fmt:message key="form.lbl.price"/>${fn:escapeXml(productNew.price)}</div>
  
  <form:form action="index" modelAttribute="index" method="post">
    <form:button><fmt:message key="form.lbl.back"/></form:button>
  </form:form>
 
</body>
</html>