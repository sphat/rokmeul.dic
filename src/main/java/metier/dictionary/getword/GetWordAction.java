package metier.dictionary.getword;

import java.util.ArrayList;
import java.util.List;

//import javassist.bytecode.Descriptor.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.hibernate.tool.DicDaoObject;
import metier.hibernate.tool.dic.Synonyme;
import metier.hibernate.tool.dic.Word;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class GetWordAction extends DicDaoObject {

	private final static String SUCCESS = "success";
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		GetWordForm getWordForm = (GetWordForm) form;

		
		List<Word> wordList = new ArrayList<Word>(DicDaoObject.getWord());
		
		getWordForm.setLstWord(wordList);
		request.setAttribute("lstWord", wordList);
		
		int j = 0;
		while (j < wordList.size()) {
			Word myWord = wordList.get(j);
			System.out.println("******PSPH Word : " + myWord.getWord());
			System.out.println("******PSPH WordDefinition : " + myWord.getWord_definition());
			System.out.println("******PSPH WordDefinition KH : " + myWord.getDefinition_kh());
			System.out.println("******PSPH WordDefinition FR : " + myWord.getDefinition_fr());
			if(myWord.getWordSyn().size()>0){
				for(Synonyme wordSyn : myWord.getWordSyn()){
					System.out.println("======PSPH WordSyn FR : " + wordSyn.getSynonyme_word());
				}
			}
			System.out.println("++++++PSPH WordType : " + myWord.getWord_type().getType_full_kh());
			j++;
		}
		
		
		return mapping.findForward(SUCCESS);
	}
	
//	public ActionForward init(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
//		GetWordForm getWordForm = (GetWordForm) form;
//		getWordForm.setWord("HELLO");
//		getWordForm.setWordDefinition("HELLO DEFINITION");
//		return mapping.findForward(SUCCESS);
//		//return init(mapping, form, request, response);
//	}
}
