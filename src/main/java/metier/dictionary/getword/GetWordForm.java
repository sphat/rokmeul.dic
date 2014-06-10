package metier.dictionary.getword;

import java.util.List;

import metier.hibernate.tool.dic.Word;

import org.apache.struts.action.ActionForm;

public class GetWordForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1158931605096392638L;
	
	private List<Word> lstWord;

	/**
	 * @return the lstWord
	 */
	public List<Word> getLstWord() {
		return lstWord;
	}

	/**
	 * @param lstWord the lstWord to set
	 */
	public void setLstWord(List<Word> lstWord) {
		this.lstWord = lstWord;
	}
	
	

}
