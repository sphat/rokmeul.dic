<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="styles/css.css" rel="stylesheet" type="text/css" />
<title>Edit word</title>
<html:base />
</head>
<body>
	<div class="body">
		<br /> <br /> <br />

		<div class="VinBlock">

			<!-- 			<div class="VinImage"> -->
			<!-- 				<img alt="Ajouter" id="1" src="Image/Vins/Bordeaux.png" /> -->
			<!-- 			</div> -->

			<div class="VinInfo">
				<div class="VinTitre">Edit Word Form</div>


				<div style="color: red">
					<html:errors />
				</div>
				<html:form action="/edit_word">
				<html:hidden property="pk_seq" name="EditWordForm" />
				<html:hidden property="synonyme_pk_seq" name="EditWordForm" />
					<div class="Table">
						<div class="Row">
							<div class="Cell">Word :</div>
							<div class="Cell">
<%-- 								<html:text name="EditWordForm" property="wordObj.word" /> --%>

								<html:text name="EditWordForm" property="word" />
								
								
								
								
<%-- 									<html:text name="EditWordForm" property="wordObj.word_type.pk_seq" /> --%>
<%-- 								<bean:write name="EditWordForm" property="wordObj.word"/> --%>
							</div>

						</div>
						<div class="Row">
							<div class="Cell">Word type : </div>
							<div class="Cell">
								<html:select property="fk_word_type_seq" name="EditWordForm">

									<logic:iterate name="lstWordType" id="lstWordTypeID">
									
										<logic:equal name="lstWordTypeID" property="pk_seq" value="${EditWordForm.fk_word_type_seq}">
											<option
												value="<bean:write name="lstWordTypeID" property="pk_seq"/>" selected="selected">
												<bean:write name="lstWordTypeID" property="type_abbriviation" />
												-
												<bean:write name="lstWordTypeID" property="type_full_fr" />
												-
												<bean:write name="lstWordTypeID" property="type_full_kh" />
											</option>									
										</logic:equal>									
									
										<logic:notEqual name="lstWordTypeID" property="pk_seq" value="${EditWordForm.fk_word_type_seq}">
											<option
												value="<bean:write name="lstWordTypeID" property="pk_seq"/>">
												<bean:write name="lstWordTypeID" property="type_abbriviation" />
												-
												<bean:write name="lstWordTypeID" property="type_full_fr" />
												-
												<bean:write name="lstWordTypeID" property="type_full_kh" />
											</option>									
										</logic:notEqual>
										
									</logic:iterate>
								</html:select>
							</div>
						</div>

						<div class="Row">
							<div class="Cell">Word Définition :</div>
							<div class="Cell">
<%-- 								<html:text name="EditWordForm" property="wordObj.word_definition" /> --%>
									<html:text name="EditWordForm" property="word_definition" />
							</div>

						</div>


						<div class="Row">
							<div class="Cell">Définition KH :</div>
							<div class="Cell">
<%-- 								<html:textarea name="EditWordForm" property="wordObj.definition_kh" styleClass="text_area" /> --%>
									<html:textarea name="EditWordForm" property="definition_kh" styleClass="text_area" />
							</div>

						</div>



						<div class="Row">
							<div class="Cell">Définition FR :</div>
							<div class="Cell">
<%-- 								<html:textarea name="EditWordForm" property="wordObj.definition_fr" styleClass="text_area" /> --%>
									<html:textarea name="EditWordForm" property="definition_fr" styleClass="text_area" />
							</div>

						</div>

						<div class="Row">
							<div class="Cell">Synonyme FR :</div>
							<div class="Cell">
<%-- 								<html:text name="EditWordForm" property="wordObj.getWordSyn" /> --%>
									<html:text name="EditWordForm" property="synonyme_fr" />
							</div>

						</div>


						<div class="Row">
							<div class="Cell">Exemple KH :</div>
							<div class="Cell">
<%-- 								<html:textarea name="EditWordForm" property="wordObj.example_kh" styleClass="text_area" /> --%>
									<html:textarea name="EditWordForm" property="example_kh" styleClass="text_area" />
							</div>

						</div>


						<div class="Row">
							<div class="Cell">Exemple FR :</div>
							<div class="Cell">
<%-- 								<html:textarea name="EditWordForm" property="wordObj.example_fr" styleClass="text_area" /> --%>
									<html:textarea name="EditWordForm" property="example_fr" styleClass="text_area" />
							</div>

						</div>

						<div class="Row">
							<div class="Cell">&nbsp;</div>
							<div class="Cell">
								<p>
									<html:submit value="Update" />
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