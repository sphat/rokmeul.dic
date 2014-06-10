<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<div style="color: red">
		<html:errors />
	</div>
	<html:form action="/add_word_type">
            Abbriviation : <html:text name="AddWordTypeForm"
			property="typeAbbr" />
		<br>
            Définition FR  : <html:text name="AddWordTypeForm"
			property="typeAbbrFullFr" />
		<br>
			Définition KH  : <html:text name="AddWordTypeForm"
			property="typeAbbrFullKh" />
		<br>
		<html:submit value="add_word_type" />
	</html:form>
</body>
</html>