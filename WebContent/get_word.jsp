<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get word</title>
    </head>
    <body>
        <html:form action="/get_word" >

            
		 <logic:iterate name="lstWord" id="lstWordID">		 
		 <p>
<%-- 		    <bean:write name="lstWordTypeID" property="pk_seq"/> -- --%>
			<a id="<bean:write name="lstWordID" property="word"/>"></a>
			Word : <bean:write name="lstWordID" property="word"/>  --  
			<bean:write name="lstWordID" property="word_definition"/>  -- 
			<bean:write name="lstWordID" property="definition_kh"/> -- <bean:write name="lstWordID" property="definition_fr"/> -- <html:link page="/edit_word.do?id=${lstWordID.pk_seq}">EDIT</html:link>
		 </p>
		 </logic:iterate>            
            
        </html:form>
        
    </body>
</html>
