<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="styles/css.css" rel="stylesheet" type="text/css" />
<jsp:include page="header.jsp" />
<title>Add word</title>
<html:base />
</head>
<body>

	<%-- 		 <logic:iterate name="lstWordType" id="lstWordTypeID">		  --%>

	<%-- 		<logic:iterate property="lstWordType" name="AddWordForm" id="lstWordTypeID"> --%>
	<!-- 		 <p> -->
	<%-- 		    <bean:write name="lstWordTypeID" property="pk_seq"/> -- --%>
	<%-- 			<bean:write name="lstWordTypeID" property="type_abbriviation"/>  --   --%>
	<%-- 			<bean:write name="lstWordTypeID" property="type_full_fr"/>  --  --%>
	<%-- 			<bean:write name="lstWordTypeID" property="type_full_kh"/> -- <html:link page="/add_word_type.do?id=${lstWordTypeID.pk_seq}">EDIT</html:link> --%>
	<!-- 		 </p> -->
	<%-- 		 </logic:iterate>		 --%>


	<!-- 		<br> -->

	<div class="body">
		<br /> <br /> <br />

		<div class="VinBlock">

			<!-- 			<div class="VinImage"> -->
			<!-- 				<img alt="Ajouter" id="1" src="Image/Vins/Bordeaux.png" /> -->
			<!-- 			</div> -->

			<div class="VinInfo">
				<div class="VinTitre">Add Word Form</div>


				<div style="color: red">
					<html:errors />
				</div>
				<html:form action="/add_word" styleId="AddWordForm">


					<div class="Table">
						<div class="Row">
							<div class="Cell">Word :</div>
							<div class="Cell">
								<html:text name="AddWordForm" property="word" styleClass="validate['required','alpha'] txtbox" />
							</div>

						</div>
						<div class="Row">
							<div class="Cell">Word type :</div>
							<div class="Cell">
								<html:select property="fk_word_type_seq" name="AddWordForm">
									<%-- <logic:iterate property="lstWordType" name="AddWordForm" id="lstWordTypeID"> --%>
									<logic:iterate name="lstWordType" id="lstWordTypeID">
										<option
											value="<bean:write name="lstWordTypeID" property="pk_seq"/>">
											<bean:write name="lstWordTypeID" property="type_abbriviation" />
											-
											<bean:write name="lstWordTypeID" property="type_full_fr" />
											-
											<bean:write name="lstWordTypeID" property="type_full_kh" />
										</option>
									</logic:iterate>
								</html:select>
							</div>
						</div>

						<div class="Row">
							<div class="Cell">Word Définition :</div>
							<div class="Cell">
								<html:text name="AddWordForm" property="word_definition" styleClass="txtbox" />
							</div>

						</div>


						<div class="Row">
							<div class="Cell">Définition KH :</div>
							<div class="Cell">
								<html:textarea name="AddWordForm" property="definition_kh"
									styleClass="text_area validate['required']" />
							</div>

						</div>



						<div class="Row">
							<div class="Cell">Définition FR :</div>
							<div class="Cell">
								<html:textarea name="AddWordForm" property="definition_fr"
									styleClass="text_area" />
							</div>

						</div>

						<div class="Row">
							<div class="Cell">Synonyme FR :</div>
							<div class="Cell">
								<html:text name="AddWordForm" property="synonyme_fr" styleClass="txtbox" />
							</div>

						</div>


						<div class="Row">
							<div class="Cell">Exemple KH :</div>
							<div class="Cell">
								<html:textarea name="AddWordForm" property="example_kh"
									styleClass="text_area" />
							</div>

						</div>


						<div class="Row">
							<div class="Cell">Exemple FR :</div>
							<div class="Cell">
								<html:textarea name="AddWordForm" property="example_fr"
									styleClass="text_area" />
							</div>

						</div>

						<div class="Row">
							<div class="Cell">&nbsp;</div>
							<div class="Cell">
								<p>
									<html:submit value="add_word" />
								</p>
							</div>

						</div>

					</div>
				</html:form>
			</div>
		</div>


	</div>
</body>
</html:html>
