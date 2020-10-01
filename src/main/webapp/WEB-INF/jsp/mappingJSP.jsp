<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String jspTest = "JSP is JAVA + HTML";
    System.out.println(jspTest);
%>
<!DOCTYPE html> 
<html lang="ko"> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>View Test Page</title> 
    </head> 
    
    <body> 
        <h2>Hello! ${name}</h2> 
        <div>JSP List Test</div> 
        <c:forEach var="item" items="${list}" varStatus="idx"> 
            ${idx.index}, ${item} 
            <br /> 
        </c:forEach>

    <input type="text" size="60" value="<%=testFunc(jspTest)%>">
    </body> 
</html>

<%!
    String testFunc(String var){
        String ret = "This thing is already exist in function : ";
        ret += var;
        return ret;
    }
%>

