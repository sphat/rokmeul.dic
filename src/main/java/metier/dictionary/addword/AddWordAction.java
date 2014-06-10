package metier.dictionary.addword;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.hibernate.tool.DicDaoObject;
import metier.hibernate.tool.dic.WordType;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AddWordAction extends DicDaoObject {

	private final static String SUCCESS = "success";
	
	// private final static String FAILURE = "failure";

	@SuppressWarnings("static-access")
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		AddWordForm addWordForm = (AddWordForm) form;
		
		// Create a collection of word type then put them in the request object
		// We will use this object in the drop down list
		List<WordType> lstWordType = new ArrayList<WordType>(
				DicDaoObject.getWordTypeList());
		
//		addWordForm.setLstWordType(lstWordType);
		
		request.setAttribute("lstWordType", lstWordType);
		
		if(addWordForm.getFk_word_type_seq()!=null){
			System.out.println("-----WordTypeSeq : "+addWordForm.getFk_word_type_seq());
			System.out.println("-----Word :	"+addWordForm.getWord());
			System.out.println("-----WordDefinition : "+addWordForm.getWord_definition());
			System.out.println("-----DifinitionKH : "+addWordForm.getDefinition_kh());
			System.out.println("-----ExampleKH : "+addWordForm.getExample_kh());
			System.out.println("-----DifinitionFr :"+addWordForm.getDefinition_fr());
			System.out.println("-----ExampleFr : "+addWordForm.getExample_fr());
			DicDaoObject.addWord(addWordForm);
			
			//addWordForm = new AddWordForm();
			//reset(mapping, request);
//			addWordForm.reset(mapping, request);
			
			//To clear form after submition
			response.setStatus(response.SC_SEE_OTHER);
			response.setHeader("Location", "http://localhost:8080/Strut_HSQLDB/add_word.do");
			//return null;
			
		}else{
			System.out.println("-----Form Not Set-----");
		}
		
//
//		request.setAttribute("wordTypeList", wordTypeList);
//
//		if (request.getAttribute("id") != null) {
//			System.out.println("request id is : " + request.getAttribute("id"));
//		} else {
//			System.out.println("request id is null");
//		}
//		
//		MainHibernate.addWord(addWordForm.getOneWord(),
//				addWordForm.getOneWordDefinition());

		return mapping.findForward(SUCCESS);
	}
	
//	public void reset(ActionMapping mapping, javax.servlet.http.HttpServletRequest request){
//		
//		System.out.println("-----Call reset form-----");
//		
//		// Create a collection of word type then put them in the request object
//		// We will use this object in the drop down list
//		List<WordType> lstWordType = new ArrayList<WordType>(
//				DicDaoObject.getWordTypeList());
//
//		//request.
//		request.setAttribute("lstWordType", lstWordType);
//		
//		mapping.findForward(SUCCESS);
//	}
}
