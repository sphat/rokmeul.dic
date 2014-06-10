<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="color: red">
		<html:errors />
	</div>
	<html:link page="/add_word.do">- Add word</html:link><br />
	<html:link page="/get_word.do">- Get word</html:link><br />
	<html:link page="/add_word_type.do">- Add word type</html:link><br />
	<html:link page="/get_word_type.do">- Get word type</html:link>
</body>
</html>