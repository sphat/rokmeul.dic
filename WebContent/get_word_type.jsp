<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get word type</title>
<html:base />
</head>
<body>
	<div style="color: red">
		<html:errors />
	</div>
	<html:form action="/add_word_type">

		<h1>Get Word Type Form</h1>
<%-- 		 Abbriviation : <html:text name="getWordTypeForm" property="hello" /> --%>
		 
		 <logic:iterate name="lstWordType" id="lstWordTypeID">		 
		 <p>
<%-- 		    <bean:write name="lstWordTypeID" property="pk_seq"/> -- --%>
			<bean:write name="lstWordTypeID" property="type_abbriviation"/>  --  
			<bean:write name="lstWordTypeID" property="type_full_fr"/>  -- 
			<bean:write name="lstWordTypeID" property="type_full_kh"/> -- <html:link page="/add_word_type.do?id=${lstWordTypeID.pk_seq}">EDIT</html:link>
		 </p>
		 </logic:iterate>

<%-- <logic:iterate name="listMsg" id="listMsgId"> --%>
<!-- <p> -->
<%-- 	List Messages <bean:write name="listMsgId"/> --%>
<!-- </p> -->
<%-- </logic:iterate> --%>


<%-- <logic:iterate name="listUsers" id="listUserId"> --%>
<!-- <p> -->
<%-- 	List Users <bean:write name="listUserId" property="username"/> ,  --%>
<%-- 	<bean:write name="listUserId" property="url"/> --%>
<!-- </p> -->
<%-- </logic:iterate> --%>

	</html:form>
</body>
</html:html>