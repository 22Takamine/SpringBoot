<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果</title>
</head>
<body>
  <h1>検索結果</h1>
  <p>
    <c:if test="${not empty product}">
      <p>product_id:${fn:escapeXml(product.productId)}</p>
       <p>product_name:${fn:escapeXml(product.productName)}</p>
        <p>price:${fn:escapeXml(product.price)}</p>
    </c:if>
  </p>
  <a href="index">戻る</a>
</body>
