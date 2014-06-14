package metier.dictionary.editword;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hsqldb.lib.StringUtil;

import metier.hibernate.tool.DicDaoObject;
import metier.hibernate.tool.dic.Synonyme;
import metier.hibernate.tool.dic.Word;
import metier.hibernate.tool.dic.WordType;

public class EditWordAction extends DicDaoObject {

	private final static String SUCCESS = "success";

	//private final static String FAILURE = "failure";
	
	@SuppressWarnings("static-access")
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		EditWordForm editWordForm = (EditWordForm) form;
		
		// Create a collection of word type then put them in the request object
		// We will use this object in the drop down list
		List<WordType> lstWordType = new ArrayList<WordType>(
				DicDaoObject.getWordTypeList());
		
		request.setAttribute("lstWordType", lstWordType);	
		
		if(!StringUtil.isEmpty(request.getParameter("id"))){		
			
			Word wordObj = DicDaoObject.getWordById(Long.valueOf(request.getParameter("id").toString()));
			
			if(wordObj!=null){
				
				editWordForm.setPk_seq(Long.valueOf(request.getParameter("id").toString()));
				editWordForm.setWordObj(wordObj);
				editWordForm.setWord(wordObj.getWord());
				editWordForm.setWord_definition(wordObj.getWord_definition());
				editWordForm.setDefinition_kh(wordObj.getDefinition_kh());
				editWordForm.setDefinition_fr(wordObj.getDefinition_fr());
				editWordForm.setPk_seq(wordObj.getPk_seq());
				editWordForm.setFk_word_type_seq(wordObj.getWord_type().getPk_seq());
				editWordForm.setExample_kh(wordObj.getExample_kh());
				editWordForm.setExample_fr(wordObj.getExample_fr());
				
				if(wordObj.getWordSyn().size()>0){
					for(Synonyme synword : wordObj.getWordSyn()){
						editWordForm.setSynonyme_fr(synword.getSynonyme_word());
						editWordForm.setSynonyme_pk_seq(synword.getPk_seq());
					}
				}
				
				System.out.println("synonyme pk sek : " + editWordForm.getSynonyme_pk_seq());
			}
		}else{
			System.out.println("-----Update Process-----");

			DicDaoObject.updateWord(editWordForm);
			response.setStatus(response.SC_SEE_OTHER);
			response.setHeader("Location", "http://localhost:8080/strutshsqldb/get_word.do#"+editWordForm.getWord());
		}
		return mapping.findForward(SUCCESS);
	}
	
	public ActionForward initPage(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("******* PSPH InitPage");
		return mapping.findForward(SUCCESS);
	}

	

}
