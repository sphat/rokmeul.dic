package metier.dictionary.addwordtype;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import metier.hibernate.tool.MainHibernate;


import metier.hibernate.tool.DicDaoObject;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AddWordTypeAction extends DicDaoObject {

	private final static String SUCCESS = "success";
	//private final static String FAILURE = "failure";
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		
		AddWordTypeForm addWordTypeForm = (AddWordTypeForm) form;
		
		if(request.getAttribute("wordType")!=null){
			System.out.println("-----test");
		}
		
		
		if(request.getParameter("id")!=null){
			System.out.println("-----request id is : " + request.getParameter("id"));
		}else{
			System.out.println("-----request id is null");
		}
		
		DicDaoObject.addwordtype(addWordTypeForm.getTypeAbbr(), addWordTypeForm.getTypeAbbrFullFr(), addWordTypeForm.getTypeAbbrFullKh());
		
		
		return mapping.findForward(SUCCESS);
	}
	
}
