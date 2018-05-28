<%@page import="java.util.ArrayList"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam01</title>
</head>
<body>
<h1>JSP 전용 태그: useBean + type + class</h1>

<pre>
-ONGL (Object Graph Navigation Language)

-자바 객체의 값을 꺼내고 설정하는 표현법
- 예 ) 객체명.객체명.프로퍼티명
  

EL 문법
 $ { OGNL 표기법 } 
 
 객체 값 꺼내기
  $ {객체명  . 프로퍼티명 }
  $ {객체명  ["프로퍼티명"]
  $ {객체명  ['프로퍼티명']
</pre>
<%
pageContext.setAttribute("name", "홍길동");
pageContext.setAttribute("age", "20"); // auto-boxing
%>

${pageScope.name } <br>
${pageScope["name"] } <br>
${pageScope['name'] } <br>

${pageScope.age } <br>

해당 객체나 프로퍼티를 찾을 수 없으면 빈 문자열이 리턴된다.
${pageScope.tel } <br>

</body>
</html>


