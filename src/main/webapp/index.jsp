<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Proyecto Academia</title>
<s:head/>

</head>


<body>
<h1 style="color : red"> <s:text name="label.saludo"></s:text> </h1>
  <s:if test="hasActionErrors()">
    <div id="campoError">
        <s:actionerror/>
    </div>
  </s:if>

  <s:form action="loginAction" namespace="/" method="post" name="loginForm">
  	<s:textfield name="usuario" size="30" maxlength="50" key="label.usuario"></s:textfield>
  
  	<s:textfield name="password" size="30" maxlength="50" key="label.password"></s:textfield>
  	
   	<s:submit key="enviar" align="rigth"></s:submit>
  </s:form>
</body>
</html>
